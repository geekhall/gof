package cn.geekhall.gof.behavior.observer.sample1;

import java.util.Observable;
import java.util.Observer;

/**
 * @author yiny
 * @Type Bear.java
 * @Desc
 * @date 5/1/21 5:29 PM
 */
public class Bear implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Float price = ((Float) arg).floatValue();
        if (price > 0){
            System.out.println("油价上涨了" + price + "元，空方伤心了！");
        } else {
            System.out.println("油价下降了" + (-price) + "元，空方高兴了！");
        }
    }
}
