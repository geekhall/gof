package cn.geekhall.gof.structure.decorator;

/**
 * @author yiny
 * @Type DecoratorSample.java
 * @Desc
 * @date 4/29/21 12:19 PM
 */
public class DecoratorSample {
    public static void execute(){
        System.out.println("==================== 结构型模式 4 : 装饰器模式（Decorator） Sample START =====================");
        Component p = new ConcreteComponent();
        p.operation();
        System.out.println("-------------------");
        Component d = new ConcreteDecorator(p);
        d.operation();
        System.out.println("==================== 结构型模式 4 : 装饰器模式（Decorator） Sample START =====================");
        System.out.println();
    }
}
