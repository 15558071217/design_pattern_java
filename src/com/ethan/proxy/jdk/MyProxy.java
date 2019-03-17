package com.ethan.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author <a href="mailto:Guanyp@hiwitech.com">Guanyp</a>
 * @date 2019/3/17
 * <p>
 * 中介类
 */
public class MyProxy implements InvocationHandler {

    /**
     * 持有被代理人的引用
     */
    private Object target;

    public MyProxy(Object target) {
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理开始");
//        不可调用设计到代理对象toString的方法，否则会死循环，一直进入此方法，如下：
//        System.out.println(proxy);//被代理对象
//        System.out.println(target == proxy);

        System.out.println("被代理的方法名是" + method.getName());//被代理方法名称
        if (args != null && args.length > 0) {
            int count = 0;
            for (Object o : args) {
                System.out.print(method.getName() + "()方法的第" + ++count + "个参数是：" + o.toString());//方法参数
            }
        } else {
            System.out.print(method.getName() + "()方法无参数");
        }
        System.out.println();
        Object resutl = method.invoke(target, args);
        System.out.println(method.getName() + "()方法的返回值是：" + resutl);//方法返回值

        System.out.println("代理结束");
        System.out.println("==========================");
        return resutl;
    }
}
