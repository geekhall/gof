package cn.geekhall.gof.behavior.memento;

/**
 * @author yiny
 * @Type MementoSample.java
 * @Desc
 * @date 5/1/21 8:48 PM
 */
public class MementoSample {
    public static void execute() {
        System.out.println("==================== 行为型模式 10 : 备忘录模式（Memento） Sample START =====================");
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("S0");
        System.out.println("初始状态：" + originator.getState());
        caretaker.setMemento(originator.createMemento()); // 保存状态
        originator.setState("S1");
        System.out.println("新的状态：" + originator.getState());
        originator.restoreMemento(caretaker.getMemento()); // 恢复状态
        System.out.println("恢复状态：" + originator.getState());

        System.out.println("==================== 行为型模式 10 : 备忘录模式（Memento） Sample END   =====================");
    }
}
