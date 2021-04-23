/**
 * @Project : GoF
 * @Package : cn.geekhall.gof.creation.prototype
 * @File : PrototypeSample.java
 * @Descriptioni : TODO
 * @Author : yiny
 * @Date : 2021/4/22 22:20
 */
package cn.geekhall.gof.creation.prototype;

/**
 * 原型模式 Sample 1
 */
public class PrototypeSample {
    public static void execute(){
        System.out.println("==================== 创建型模式 2 : 原型模式（Prototype） Sample START =====================");

        /**
         * Sample 1
         */
        try {
            Realizetype objectA = new Realizetype();
            Realizetype objectB = objectA.clone();
            System.out.println(objectA);
            System.out.println(objectB);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        /**
         * Sample 2
         */
        PrototypeManager pm = new PrototypeManager();
        Shape obj1 = pm.getShape("Circle");
        obj1.countArea();
        Shape obj2 = pm.getShape("Square");
        obj2.countArea();
        System.out.println("==================== 创建型模式 2 : 原型模式（Prototype） Sample END =====================\n");
    }
}
