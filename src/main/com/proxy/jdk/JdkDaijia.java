package main.com.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkDaijia implements InvocationHandler {

    private Object o = null;

    public JdkDaijia(Object o){
        this.o = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代驾");
        method.invoke(o, args);
        System.out.println("送客户回家");
        return null;
    }
}
