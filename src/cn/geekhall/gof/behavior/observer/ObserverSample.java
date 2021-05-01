package cn.geekhall.gof.behavior.observer;

import cn.geekhall.gof.behavior.observer.sample1.Bear;
import cn.geekhall.gof.behavior.observer.sample1.Bull;
import cn.geekhall.gof.behavior.observer.sample1.OilFutures;

/**
 * @author yiny
 * @Type ObserverSample.java
 * @Desc
 * @date 5/1/21 5:14 PM
 */
public class ObserverSample {
    public static void execute() {
        System.out.println("==================== 行为型模式 6 : 观察者模式（Observer） Sample START =====================");
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();

        subject.add(observer1);
        subject.add(observer2);
        subject.notifyObserver();

        System.out.println("---------- Sample 1 Start ------------");
        OilFutures oilFutures = new OilFutures();
        java.util.Observer bull = new Bull();
        java.util.Observer bear = new Bear();

        oilFutures.addObserver(bull);
        oilFutures.addObserver(bear);
        oilFutures.setPrice(10);
        oilFutures.setPrice(-8);

        System.out.println("---------- Sample 1 End   ------------");
        System.out.println("==================== 行为型模式 6 : 观察者模式（Observer） Sample END =====================");
        System.out.println();
    }
}
