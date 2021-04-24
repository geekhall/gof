package cn.geekhall.gof.structure.proxy.staticproxy;

/**
 * @author yiny
 * @Type Proxy.java
 * @Desc
 * @date 4/24/21 12:14 PM
 */
public class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null){
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    public void preRequest(){
        System.out.println("访问真实主题之前的预处理。。。");
    }

    public void postRequest(){
        System.out.println("访问真实主题之后的后续处理。。。");
    }
}
