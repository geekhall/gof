package cn.geekhall.gof.behavior.state;

/**
 * @author yiny
 * @Type ConcreteStateA.java
 * @Desc
 * @date 5/1/21 4:04 PM
 */
public class ConcreteStateA extends State {


    @Override
    public void handle(Context context) {
        System.out.println("当前状态是 【A】。");
        context.setState(new ConcreteStateB());
    }
}
