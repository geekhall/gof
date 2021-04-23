package cn.geekhall.gof.creation.factory.simplefactory;

/**
 * @author yiny
 * @Type ConcreteProductA.java
 * @Desc
 * @date 4/23/21 8:48 PM
 */
public class ConcreteProductA implements Product {

    @Override
    public void show() {
        System.out.println("具体产品A显示。。。");
    }
}
