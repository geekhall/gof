package cn.geekhall.gof.principle.principle7;

import cn.geekhall.gof.principle.principle7.goodsample.Car;
import cn.geekhall.gof.principle.principle7.goodsample.Color;

/**
 * @author yiny
 * @Type CRPSample.java
 * @Desc
 * @date 4/22/21 8:02 PM
 */
public class CRPSample {
    public static void execute(){
        System.out.println("==================== Principle 7 : 合成复用原则 Sample START =====================");

        Car car = new Car();
        car.setColor(Color.BLACK);
        car.move();
        car.setColor(Color.RED);
        car.move();

        System.out.println("==================== Principle 7 : 合成复用原则 Sample END =====================");
        System.out.println("");
    }
}
