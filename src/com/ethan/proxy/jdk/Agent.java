package com.ethan.proxy.jdk;

/**
 * @author <a href="mailto:Guanyp@hiwitech.com">Guanyp</a>
 * @date 2019/3/17
 * 
 * 中介类
 */
public class Agent implements Renting {

    /**
     * 持有被代理人的引用
     */
    private Renter renter;

    public Agent(Renter renter) {
        this.renter = renter;
    }
    
    @Override
    public void rent() {
        renter.rent();
        System.out.println("========================");
        System.out.println("开始为你找符合条件的房子");
        System.out.println("找到房子，如果合适就签合同吧");
    }
}
