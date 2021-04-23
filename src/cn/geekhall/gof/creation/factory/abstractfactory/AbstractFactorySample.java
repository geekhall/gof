package cn.geekhall.gof.creation.factory.abstractfactory;

/**
 * @author yiny
 * @Type AbstractFactorySample.java
 * @Desc
 * @date 4/23/21 11:08 PM
 */
public class AbstractFactorySample {
    public static void execute(){
        System.out.println("==================== 创建型模式 3 : 抽象工厂模式（AbstractFactory） Sample START =====================");
        ConcreteFactory1 factory1 = new ConcreteFactory1();
        ProductA productA1 = factory1.newProductA();
        ProductB productB1 = factory1.newProductB();
        ProductC productC1 = factory1.newProductC();

        ConcreteFactory2 factory2 = new ConcreteFactory2();
        ProductA productA2 = factory2.newProductA();
        ProductB productB2 = factory2.newProductB();
        ProductC productC2 = factory2.newProductC();

        productA1.showA();
        productA2.showA();
        productB1.showB();
        productB2.showB();
        productC1.showC();
        productC2.showC();


        System.out.println("==================== 创建型模式 3 : 抽象工厂模式（AbstractFactory） Sample START =====================\n");
    }
}
