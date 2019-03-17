package com.ethan.proxy.jdk;


import java.lang.reflect.Proxy;

/**
 * 代理模式：
 * 
 * 提供一种代理来控制对其他对象的访问
 */
public class Main {

    public static void main(String[] args) {

        /**
         * 创建一个被代理对象
         */
        Renter renter = new Renter("Ethan");

        //通过jdk动态代理获取代理对象
        Renting renting = (Renting) Proxy.newProxyInstance(renter.getClass().getClassLoader(),
                renter.getClass().getInterfaces(), new MyProxy(renter));
        
        //通过代理对象调用rent方法，期间会调用invoke方法
        renting.rent(5);
        renting.rentParking();
        
    }
}
