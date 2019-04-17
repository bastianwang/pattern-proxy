package test.com.proxy.cglib;

import main.com.proxy.bean.Car;
import main.com.proxy.bean.ChangchengCar;
import main.com.proxy.cglib.CglibDaijia;
import net.sf.cglib.proxy.Enhancer;

public class CglibProxyTest {

    public static void main(String[] args) {
        //客户提车
        Car car = new ChangchengCar();
        //叫代驾
        CglibDaijia cglibDaijia = new CglibDaijia();
        //代驾上车
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(car.getClass());
        enhancer.setCallback(cglibDaijia);
        Car proxy = (Car)enhancer.create();
        //代驾开车
        proxy.dirve();
    }
}
