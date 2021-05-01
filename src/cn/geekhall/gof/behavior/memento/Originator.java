package cn.geekhall.gof.behavior.memento;

/**
 * @author yiny
 * @Type Originator.java
 * @Desc 发起人
 * @date 5/1/21 8:45 PM
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    Memento createMemento(){
        return new Memento(state);
    }

    void restoreMemento(Memento memento){
        this.setState(memento.getState());
    }
}
