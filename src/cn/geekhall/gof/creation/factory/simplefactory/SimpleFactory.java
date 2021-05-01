package cn.geekhall.gof.creation.factory.simplefactory;

/**
 * @author yiny
 * @Type SimpleFactory.java
 * @Desc
 * @date 4/23/21 8:47 PM
 */
class SimpleFactory {
    /**
     * 工厂类的创建产品类的方法，可以被外界直接调用，创建所需的产品对象。
     * @param kind 产品的类别
     * @return 对应的产品实例
     */
    static Product makeProduct(int kind) {
        switch (kind) {
            case Const.PRODUCT_A:
                return new ConcreteProductA();
            case Const.PRODUCT_B:
                return new ConcreteProductB();
            case Const.PRODUCT_C:
                return new ConcreteProductC();
        }
        return null;
    }
}
