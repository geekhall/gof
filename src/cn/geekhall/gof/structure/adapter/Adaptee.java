package cn.geekhall.gof.structure.adapter;

/**
 * @author yiny
 * @Type Adaptee.java
 * @Desc 适配器接口，要被适配的类、适配者（网线）
 * @date 4/24/21 6:30 PM
 */
public class Adaptee {

    public void specificRequest(){
        System.out.println("适配者中的业务代码被调用。。。");
    }
}
