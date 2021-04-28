/**
 * @Project : GoF
 * @Package : cn.geekhall.gof.structure.proxy.dynamicproxy.sample1
 * @File : ProxyInvocationHandler.java
 * @Descriptioni : TODO
 * @Author : yiny
 * @Date : 2021/4/28 20:36
 */
package cn.geekhall.gof.structure.proxy.dynamicproxy.sample2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 使用这个类动态生成代理类
public class MyInvocationHandler implements InvocationHandler {

    private Object target;
    public MyInvocationHandler(Object target){
        super();
        this.target = target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    // 生成得到代理类，这里的代理类就是动态生成的。
    public Object getProxy() {
//        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
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

        log(method.getName());
        preMethod(method.getName());
        // 动态代理的本质，就是使用反射机制实现。使用代理类调用target的method方法
        Object result = method.invoke(target, args);
        postMethod(method.getName());
        return result;
    }

    /**
     * 预处理：参数设置、记录日志、性能监控、记录时间等等。
     */
    public void preMethod(String msg){
        System.out.println("动态代理："+msg+"执行预处理");
    }

    /**
     * 事后处理：终止时间、清理数据等
     */
    public void postMethod(String msg){

        System.out.println("动态代理："+msg+"执行事后清理");
    }

    public void log(String msg){
        System.out.println("执行了" + msg + "方法！");
    }
}
