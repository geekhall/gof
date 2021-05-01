package cn.geekhall.gof.behavior.interpreter;

/**
 * @author yiny
 * @Type InterpreterSample.java
 * @Desc
 * @date 5/1/21 9:16 PM
 */
public class InterpreterSample {
    public static void execute() {
        System.out.println("==================== 行为型模式 11 : 解释器模式（Interpreter） Sample START =====================");
        Context bus = new Context();
        System.out.println("-----------");
        bus.freeRide("北京的老人");
        System.out.println("-----------");
        bus.freeRide("上海的年轻人");
        System.out.println("-----------");
        bus.freeRide("广州的妇女");
        System.out.println("-----------");
        bus.freeRide("深圳的小孩");
        System.out.println("-----------");
        System.out.println("==================== 行为型模式 11 : 解释器模式（Interpreter） Sample END =====================");
        System.out.println();
    }
}
