/**
 * @Project : GoF
 * @Package : cn.geekhall.gof.structure.proxy.dynamicproxy.sample1
 * @File : ProxyInvocationHandler.java
 * @Descriptioni : TODO
 * @Author : yiny
 * @Date : 2021/4/28 20:36
 */
package cn.geekhall.gof.structure.proxy.dynamicproxy.sample1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 使用这个类动态生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    // 生成得到代理类，这里的代理类就是动态生成的。
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    /**
     * 处理代理实例，并返回结果。
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        seeHouse();

        // 动态代理的本质，就是使用反射机制实现。
        Object result = method.invoke(rent, args);
        makeContract();
        charge(2000);
        return result;
    }

    /**
     * 看房子
     */
    public void seeHouse(){
        System.out.println("动态代理：中介带你看房子");
    }

    /**
     * 签合同
     */
    public void makeContract(){
        System.out.println("动态代理：签合同");
    }

    /**
     * 收中介费
     */
    public void charge(double cost){
        System.out.println("动态代理：收中介费， 价格： " + cost);
    }
}
