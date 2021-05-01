package cn.geekhall.gof.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yiny
 * @Type Subject.java
 * @Desc
 * @date 5/1/21 5:06 PM
 */
public abstract class Subject {

    // 观察者列表
    List<Observer> observers = new ArrayList<Observer>();

    // 添加观察者
    public void add(Observer observer){
        observers.add(observer);
    }

    // 删除观察者
    public void remove(Observer observer){
        observers.remove(observer);
    }

    // 通知观察者
    public abstract void notifyObserver();
}
