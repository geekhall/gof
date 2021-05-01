package cn.geekhall.gof.behavior.mediator;

/**
 * @author yiny
 * @Type Colleague.java
 * @Desc 抽象同事类
 * @date 5/1/21 5:41 PM
 */
abstract class Colleague {
    Mediator mediator;

    void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();

    public abstract void send();
}
