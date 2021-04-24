package cn.geekhall.gof.structure.adapter.sample2;

/**
 * @author yiny
 * @Type Adapter2.java
 * @Desc
 * @date 4/24/21 7:39 PM
 */
public class Adapter2 implements Net2Usb{
    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleRequest() {
        adaptee.request();
    }
}
