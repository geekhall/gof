package cn.geekhall.gof.behavior.mediator;

/**
 * @author yiny
 * @Type MediatorSample.java
 * @Desc
 * @date 5/1/21 5:44 PM
 */
public class MediatorSample {
    public static void execute(){
        System.out.println("==================== 行为型模式 7 : 中介者模式（Mediator） Sample START =====================");
        Mediator mediator = new ConcreteMediator();
        Colleague colleague1 = new ConcreteColleague1();
        Colleague colleague2 = new ConcreteColleague2();

        mediator.register(colleague1);
        mediator.register(colleague2);
        colleague1.send();
        System.out.println("-----------------");
        colleague2.send();
        System.out.println("==================== 行为型模式 7 : 中介者模式（Mediator） Sample END =====================");
        System.out.println();
    }
}
