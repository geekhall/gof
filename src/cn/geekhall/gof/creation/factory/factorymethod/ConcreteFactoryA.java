package cn.geekhall.gof.creation.factory.factorymethod;

/**
 * @author yiny
 * @Type ConcreteFactoryA.java
 * @Desc
 * @date 4/23/21 9:16 PM
 */
public class ConcreteFactoryA implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("具体工厂A生成 ------>  具体产品A 。。。");
        return new ConcreteProductA();
    }
}
