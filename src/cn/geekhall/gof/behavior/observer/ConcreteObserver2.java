package cn.geekhall.gof.behavior.observer;

/**
 * @author yiny
 * @Type ConcreteObserver2.java
 * @Desc
 * @date 5/1/21 5:07 PM
 */
public class ConcreteObserver2 implements Observer {
    @Override
    public void response() {
        System.out.println("具体观察者2 做出了反应。。。");
    }
}
