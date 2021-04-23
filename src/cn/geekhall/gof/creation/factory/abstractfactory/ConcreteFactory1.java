package cn.geekhall.gof.creation.factory.abstractfactory;

/**
 * @author yiny
 * @Type ConcreteFactoryA.java
 * @Desc
 * @date 4/23/21 10:32 PM
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public ProductA newProductA() {
        System.out.println("具体工厂1 生成----> 具体产品A。。。");
        return new ConcreteProductA1();
    }

    @Override
    public ProductB newProductB() {
        System.out.println("具体工厂1 生成----> 具体产品B。。。");
        return new ConcreteProductB1();
    }

    @Override
    public ProductC newProductC() {
        System.out.println("具体工厂1 生成----> 具体产品C。。。");
        return new ConcreteProductC1();
    }
}
