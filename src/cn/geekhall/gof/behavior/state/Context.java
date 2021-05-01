package cn.geekhall.gof.behavior.state;

/**
 * @author yiny
 * @Type Context.java
 * @Desc
 * @date 5/1/21 4:03 PM
 */
public class Context {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Context() {
        this.state = new ConcreteStateA();
    }

    public void handle(){
        state.handle(this);
    }
}
