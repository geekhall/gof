package cn.geekhall.gof.behavior.mediator;

/**
 * @author yiny
 * @Type ConcreteColleague1.java
 * @Desc 具体同事类1
 * @date 5/1/21 5:42 PM
 */
class ConcreteColleague1 extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类1 收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类1 发出请求。");
        mediator.relay(this);
    }
}
