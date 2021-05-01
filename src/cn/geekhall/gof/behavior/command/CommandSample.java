package cn.geekhall.gof.behavior.command;

/**
 * @author yiny
 * @Type CommandSample.java
 * @Desc
 * @date 5/1/21 11:30 AM
 */
public class CommandSample {
    public static void execute() {
        System.out.println("==================== 行为型模式 3 : 命令模式（Command） Sample START =====================");
        Command command = new ConcreteCommand();
        Invoker invoker = new Invoker(command);
        System.out.println("客户访问调用者的call()方法。。。");
        invoker.call();
        System.out.println("==================== 行为型模式 3 : 命令模式（Command） Sample END   =====================");
        System.out.println();
    }
}
