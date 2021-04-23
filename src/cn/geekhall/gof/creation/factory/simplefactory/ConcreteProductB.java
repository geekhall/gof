package cn.geekhall.gof.creation.factory.simplefactory;

/**
 * @author yiny
 * @Type ConcreteProductB.java
 * @Desc
 * @date 4/23/21 8:49 PM
 */
public class ConcreteProductB implements Product {
    @Override
    public void show() {
        System.out.println("具体产品B显示。。。");
    }
}
