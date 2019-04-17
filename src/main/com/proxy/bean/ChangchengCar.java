package main.com.proxy.bean;

/**
 *  长城汽车
 */
public class ChangchengCar implements Car {
    @Override
    public String getName() {
        return "长城汽车";
    }

    @Override
    public void dirve() {
        System.out.println("开长城汽车");
    }
}
