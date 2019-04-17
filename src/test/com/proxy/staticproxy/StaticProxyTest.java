package test.com.proxy.staticproxy;

import main.com.proxy.bean.ChangchengCar;
import main.com.proxy.staticproxy.StaticDaijia;

public class StaticProxyTest {
    public static void main(String[] args) {

        StaticDaijia daijia = new StaticDaijia(new ChangchengCar());
        daijia.dirve();
    }
}
