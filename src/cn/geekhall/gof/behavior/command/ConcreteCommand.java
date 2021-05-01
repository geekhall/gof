package cn.geekhall.gof.behavior.command;

/**
 * @author yiny
 * @Type ConcreteCommand.java
 * @Desc 具体命令
 * @date 5/1/21 11:27 AM
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    ConcreteCommand() {
        this.receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
