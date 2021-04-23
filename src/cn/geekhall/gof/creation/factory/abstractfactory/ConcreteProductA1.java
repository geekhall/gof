package cn.geekhall.gof.creation.factory.abstractfactory;

import cn.geekhall.gof.creation.factory.factorymethod.Product;

/**
 * @author yiny
 * @Type ConcreteProductA1.java
 * @Desc
 * @date 4/23/21 10:35 PM
 */
public class ConcreteProductA1 implements ProductA {
    @Override
    public void showA() {
        System.out.println("我是具体产品A1。");
    }
}
