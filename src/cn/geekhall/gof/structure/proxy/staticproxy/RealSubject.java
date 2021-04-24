package cn.geekhall.gof.structure.proxy.staticproxy;

/**
 * @author yiny
 * @Type RealSubject.java
 * @Desc
 * @date 4/24/21 12:11 PM
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("访问真实主题方法。。。");
    }
}
