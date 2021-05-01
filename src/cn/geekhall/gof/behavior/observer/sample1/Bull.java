package cn.geekhall.gof.behavior.observer.sample1;

import java.util.Observable;
import java.util.Observer;

/**
 * @author yiny
 * @Type Bull.java
 * @Desc 具体观察者类：多方
 * @date 5/1/21 5:26 PM
 */
public class Bull implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Float price = ((Float) arg).floatValue();
        if (price > 0){
            System.out.println("油价上涨了" + price + "元，多方高兴了！");
        } else {
            System.out.println("油价下降了" + (-price) + "元，多方伤心了！");
        }
    }
}
