package cn.geekhall.gof.structure.proxy.dynamicproxy;

/**
 * @author yiny
 * @Type RealSUbjectA.java
 * @Desc
 * @date 4/24/21 2:37 PM
 */
public class RealSUbjectA implements ISubject {
    public void request() {
        System.out.println("访问真实主题A。。。");
    }
}
