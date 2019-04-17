package main.com.proxy.staticproxy;

import main.com.proxy.bean.Car;

public class StaticDaijia implements Car {
    private Car car = null;

    public StaticDaijia(Car car){
        this.car = car;
    }

    @Override
    public String getName() {
        return "代驾";
    }

    @Override
    public void dirve() {
        System.out.println("代驾");
        car.dirve();
        System.out.println("送客户回家");
    }
}
