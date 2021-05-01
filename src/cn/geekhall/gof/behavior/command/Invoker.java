package cn.geekhall.gof.behavior.command;

/**
 * @author yiny
 * @Type Invoker.java
 * @Desc 命令调用者
 * @date 5/1/21 11:28 AM
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    void call(){
        System.out.println("调用者执行命令command....");
        command.execute();
    }
}
