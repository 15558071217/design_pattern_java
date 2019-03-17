package com.ethan.proxy.jdk;


/**
 * 代理模式：
 * 
 * 提供一种代理来控制对其他对象的访问
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        
        
        Agent agent = new Agent(new Renter());
        agent.rent();
    }
}
