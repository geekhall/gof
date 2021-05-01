package cn.geekhall.gof.behavior.observer.sample1;

import java.util.Observable;

/**
 * @author yiny
 * @Type OilFutures.java
 * @Desc 具体目标类：原油期货
 * @date 5/1/21 5:23 PM
 */
public class OilFutures extends Observable {
    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        super.setChanged();             // 设置内部标志位，注明数据发生变化。
        super.notifyObservers(price);   // 通知观察者价格发生变化了。
        this.price = price;
    }
}
