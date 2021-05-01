package cn.geekhall.gof.behavior.mediator;

/**
 * @author yiny
 * @Type ConcreteColleague.java
 * @Desc
 * @date 5/1/21 5:42 PM
 */
class ConcreteColleague2 extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类2 收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类2 发出请求。");
        mediator.relay(this);
    }
}
