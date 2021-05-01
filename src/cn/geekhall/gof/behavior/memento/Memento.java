package cn.geekhall.gof.behavior.memento;

/**
 * @author yiny
 * @Type Memento.java
 * @Desc 备忘录
 * @date 5/1/21 8:44 PM
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
