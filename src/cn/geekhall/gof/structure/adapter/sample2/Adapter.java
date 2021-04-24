package cn.geekhall.gof.structure.adapter.sample2;

/**
 * @author yiny
 * @Type Adapter.java
 * @Desc 适配器、转接头
 * @date 4/24/21 7:28 PM
 */
public class Adapter extends Adaptee implements Net2Usb{

    @Override
    public void handleRequest() {
        request();
    }
}
