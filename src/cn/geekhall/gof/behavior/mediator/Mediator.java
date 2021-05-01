package cn.geekhall.gof.behavior.mediator;

/**
 * @author yiny
 * @Type Mediator.java
 * @Desc 抽象中介者
 * @date 5/1/21 5:40 PM
 */
abstract class Mediator {
    public abstract void register(Colleague colleague);

    public abstract void relay(Colleague colleague);
}
