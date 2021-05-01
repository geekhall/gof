/**
 * @Project : GoF
 * @Package : cn.geekhall.gof.principle.principle2
 * @File : Bird.java
 * @Descriptioni : TODO
 * @Author : yiny
 * @Date : 2021/4/20 22:09
 */
package cn.geekhall.gof.principle.principle2;

public class Bird {
    double flySpeed;

    public double getFlySpeed() {
        return flySpeed;
    }

    public void setFlySpeed(double flySpeed) {
        this.flySpeed = flySpeed;
    }

    double getFlyTime(double distance) {
        return (distance / flySpeed);
    }
}
