package cn.geekhall.gof.structure.composite;

import java.awt.*;

/**
 * @author yiny
 * @Type ComponentSample.java
 * @Desc
 * @date 4/29/21 1:59 PM
 */
public class ComponentSample {
    public static void execute() {
        System.out.println("==================== 结构型模式 7 : 组合模式（Component） Sample START =====================");
        Component branch1 = new Branch();
        Component branch2 = new Branch();
        Component leaf1 = new Leaf("1");
        Component leaf2 = new Leaf("2");
        Component leaf3 = new Leaf("3");

        branch1.add(leaf1);
        branch1.add(branch2);
        branch2.add(leaf2);
        branch2.add(leaf3);
        branch1.operation();


        System.out.println("==================== 结构型模式 7 : 组合模式（Component） Sample END =====================");
    }
}
