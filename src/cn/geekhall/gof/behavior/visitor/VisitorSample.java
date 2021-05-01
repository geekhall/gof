package cn.geekhall.gof.behavior.visitor;

/**
 * @author yiny
 * @Type VisitorSample.java
 * @Desc
 * @date 5/1/21 8:33 PM
 */
public class VisitorSample {
    public static void execute() {
        System.out.println("==================== 行为型模式 9 : 访问者模式（Visitor） Sample START =====================");
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new ConcreteElementA());
        objectStructure.add(new ConcreteElementB());

        Visitor visitor = new ConcreteVisitorA();
        objectStructure.accept(visitor);
        System.out.println("-----------------");
        visitor = new ConcreteVisitorB();
        objectStructure.accept(visitor);

        System.out.println("==================== 行为型模式 9 : 访问者模式（Visitor） Sample END =====================");
        System.out.println();
    }
}
