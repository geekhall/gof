package cn.geekhall.gof.behavior.observer;

/**
 * @author yiny
 * @Type ConcreteSubject.java
 * @Desc
 * @date 5/1/21 5:12 PM
 */
public class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变。。。");
        System.out.println("-------------");
        for (Observer observer: observers){
            observer.response();
        }
    }
}
