package com.ethan.proxy.jdk;

/**
 * @author <a href="mailto:Guanyp@hiwitech.com">Guanyp</a>
 * @date 2019/3/17
 * 租客类
 */
public class Renter implements Renting{

    private String name;

    Renter(String name) {
        this.name = name;
    }
    @Override
    public int rent(int num) {
        System.out.println("我是" + name + "，我要租1500一下的房子");
        System.out.println("我需要" + num + "间这样的房子");
        System.out.println("我想要在灵隐寺附近3公里内");
        System.out.println("需要可以做饭");
        return num;
    }

    @Override
    public int rentParking() {
        System.out.println("我是" + name + "，我要租一个车位");
        return 1;
    }
}
