package cn.geekhall.gof.behavior.memento;

/**
 * @author yiny
 * @Type Caretaker.java
 * @Desc 管理者
 * @date 5/1/21 8:47 PM
 */
class Caretaker {
    private Memento memento;

    Memento getMemento() {
        return memento;
    }

    void setMemento(Memento memento) {
        this.memento = memento;
    }
}
