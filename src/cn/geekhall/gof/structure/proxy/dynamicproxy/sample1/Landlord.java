/**
 * @Project : GoF
 * @Package : cn.geekhall.gof.structure.proxy.dynamicproxy.sample1
 * @File : Landlord.java
 * @Descriptioni : TODO
 * @Author : yiny
 * @Date : 2021/4/28 20:34
 */
package cn.geekhall.gof.structure.proxy.dynamicproxy.sample1;

public class Landlord implements Rent {
    @Override
    public void rent() {
        System.out.println("房东要出租房子！");
    }
}
