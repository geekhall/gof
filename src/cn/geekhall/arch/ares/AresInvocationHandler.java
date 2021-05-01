package cn.geekhall.arch.ares;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yiny
 * @Type AresInvocationHandler.java
 * @Desc
 * @date 5/1/21 11:34 AM
 */
public class AresInvocationHandler implements InvocationHandler {
    private Object target;

    public AresInvocationHandler(Object target) {
        super();
        this.target = target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(target, args);
        log(method.getName());
        return result;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
    }

    public void log(String msg){
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+= " + msg + " +=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
    }
}
