package cn.geekhall.gof.creation.factory.factorymethod;

/**
 * @author yiny
 * @Type ConcreteProductA.java
 * @Desc
 * @date 4/23/21 9:13 PM
 */
public class ConcreteProductA implements Product {
    @Override
    public void show() {
        System.out.println("具体产品A显示。。。");
    }
}
