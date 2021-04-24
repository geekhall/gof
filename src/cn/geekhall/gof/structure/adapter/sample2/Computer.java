package cn.geekhall.gof.structure.adapter.sample2;

/**
 * @author yiny
 * @Type Computer.java
 * @Desc 客户端类，电脑，没有网口，插不上网线。
 * @date 4/24/21 7:27 PM
 */
public class Computer {

    public void net(Net2Usb adapter){
        // 上网的具体实现，连不上网线，找一个转接头。
        adapter.handleRequest();
    }
}
