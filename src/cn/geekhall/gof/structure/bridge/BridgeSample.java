package cn.geekhall.gof.structure.bridge;

import cn.geekhall.gof.structure.bridge.sample1.*;

/**
 * @author yiny
 * @Type BridgeSample.java
 * @Desc
 * @date 4/24/21 9:26 PM
 */
public class BridgeSample {
    public static void execute(){
        System.out.println("==================== 结构型模式 3 : 桥接模式（Bridge） Sample START =====================");
        Implementor implementor = new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();


        System.out.println("----------- Sample 1 start ------------");
        Computer apple = new Laptop(new Apple());
        apple.info();
        Computer huawei = new Desktop(new Huawei());
        huawei.info();

        System.out.println("----------- Sample 1 end ------------");
        System.out.println("==================== 结构型模式 3 : 桥接模式（Bridge） Sample END =======================");
        System.out.println();
    }
}
