package cn.geekhall.gof.structure.flyweight;

import cn.geekhall.gof.structure.flyweight.sample.ChessSample;

/**
 * @author yiny
 * @Type FlyweightSample.java
 * @Desc
 * @date 4/29/21 12:55 PM
 */
public class FlyweightSample {
    public static void execute() {
        System.out.println("==================== 结构型模式 6 : 享元模式（Flyweight） Sample START =====================");
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight f01 = factory.getFlyweight("a");
        Flyweight f02 = factory.getFlyweight("a");
        Flyweight f03 = factory.getFlyweight("a");
        Flyweight f11 = factory.getFlyweight("b");
        Flyweight f12 = factory.getFlyweight("b");

        f01.operation(new UnsharedConcreteFlyweight("第1次调用a。"));
        f02.operation(new UnsharedConcreteFlyweight("第2次调用a。"));
        f03.operation(new UnsharedConcreteFlyweight("第3次调用a。"));
        f11.operation(new UnsharedConcreteFlyweight("第1次调用b。"));
        f12.operation(new UnsharedConcreteFlyweight("第2次调用b。"));

        System.out.println("------------------ Chess Sample ----------------------");
        //ChessSample.execute();
        System.out.println("------------------ Chess Sample ----------------------");
        System.out.println("==================== 结构型模式 6 : 享元模式（Flyweight） Sample END =====================");
    }
}
