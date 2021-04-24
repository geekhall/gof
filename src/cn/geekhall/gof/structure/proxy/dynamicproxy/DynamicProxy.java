package cn.geekhall.gof.structure.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;

/**
 * @author yiny
 * @Type DynamicProxy.java
 * @Desc
 * @date 4/24/21 2:41 PM
 */
public class DynamicProxy implements ISubject{
    InvocationHandler handler;

    public DynamicProxy(InvocationHandler handler) {
        this.handler = handler;
    }

    @Override
    public void request() {
//        try {
//            handler.invoke(this, ISubject.class.getMethod("request"));
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
    }
}
