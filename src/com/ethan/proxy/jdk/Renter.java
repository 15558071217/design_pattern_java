package com.ethan.proxy.jdk;

/**
 * @author <a href="mailto:Guanyp@hiwitech.com">Guanyp</a>
 * @date 2019/3/17
 * 租客类
 */
public class Renter implements Renting{
    
    
    @Override
    public void rent() {
        System.out.println("我是租客，我要租1500一下的房子");
        System.out.println("我想要在灵隐寺附近3公里内");
        System.out.println("需要可以做饭");
    }
}
