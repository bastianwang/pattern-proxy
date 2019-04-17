package test.com.proxy.jdk;

import main.com.proxy.bean.Car;
import main.com.proxy.bean.ChangchengCar;
import main.com.proxy.jdk.JdkDaijia;

import java.lang.reflect.Proxy;

/**
 * jdk动态代理测试
 */
public class JdkProxyTest {

    public static void main(String[] args) {
        ChangchengCar changchengCar = new ChangchengCar();
        JdkDaijia jdkDaijia = new JdkDaijia(changchengCar);
        Car car = (Car)Proxy.newProxyInstance(Car.class.getClassLoader(), ChangchengCar.class.getInterfaces(), jdkDaijia);
        car.dirve();
    }

}
