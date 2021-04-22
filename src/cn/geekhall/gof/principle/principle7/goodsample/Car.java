package cn.geekhall.gof.principle.principle7.goodsample;

/**
 * @author yiny
 * @Type Car.java
 * @Desc
 * @date 4/22/21 1:09 PM
 */
public class Car {
    private Color color;

    public Car() {
    }

    public Car(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public void move(){
        System.out.println("My " + color + " Car is running.");
    }
}
