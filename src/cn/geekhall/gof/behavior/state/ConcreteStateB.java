package cn.geekhall.gof.behavior.state;

/**
 * @author yiny
 * @Type ConcreteStateB.java
 * @Desc
 * @date 5/1/21 4:07 PM
 */
public class ConcreteStateB extends State {
    @Override
    public void handle(Context context) {
        System.out.println("当前状态是 【B】。");
        context.setState(new ConcreteStateA());
    }
}
