package cn.geekhall.gof.behavior.observer;

/**
 * @author yiny
 * @Type ConcreteObserver1.java
 * @Desc
 * @date 5/1/21 5:07 PM
 */
public class ConcreteObserver1 implements Observer {
    @Override
    public void response() {
        System.out.println("具体观察者1 做出了反应。。。");
    }
}
