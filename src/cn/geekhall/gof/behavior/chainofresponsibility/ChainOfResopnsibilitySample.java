package cn.geekhall.gof.behavior.chainofresponsibility;

import cn.geekhall.gof.behavior.chainofresponsibility.sample1.*;

/**
 * @author yiny
 * @Type ChainOfResopnsibilitySample.java
 * @Desc
 * @date 5/1/21 3:34 PM
 */
public class ChainOfResopnsibilitySample {
    public static void execute() {
        System.out.println("==================== 行为型模式 4 : 责任链模式（Chain of responsibility） Sample START =====================");
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);

        handler1.handleRequest("two");
        System.out.println("---------- Sample 1 start------------");
        Leader teacher1 = new ClassAdviser();
        Leader teacher2 = new DepartmentHead();
        Leader teacher3 = new Dean();
        Leader teacher4 = new Headmaster();

        teacher1.setNext(teacher2);
        teacher2.setNext(teacher3);
        teacher3.setNext(teacher4);

        teacher1.handleRequest(1);
        teacher1.handleRequest(3);
        teacher1.handleRequest(15);
        teacher1.handleRequest(25);
        teacher1.handleRequest(100);
        System.out.println("---------- Sample 1 end  ------------");
        System.out.println("==================== 行为型模式 4 : 责任链模式（Chain of responsibility） Sample END   =====================");
        System.out.println();
    }
}
