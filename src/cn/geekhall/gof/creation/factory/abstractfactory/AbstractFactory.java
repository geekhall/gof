package cn.geekhall.gof.creation.factory.abstractfactory;

/**
 * @author yiny
 * @Type AbstractFactory.java
 * @Desc
 * @date 4/23/21 10:29 PM
 */
public interface AbstractFactory {
    public ProductA newProductA();
    public ProductB newProductB();
    public ProductC newProductC();
}
