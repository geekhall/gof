/**
 * @Project : GoF
 * @Package : cn.geekhall.gof.principle.principle2
 * @File : BrownKiwi.java
 * @Descriptioni : TODO
 * @Author : yiny
 * @Date : 2021/4/20 22:10
 */
package cn.geekhall.gof.principle.principle2;

public class BrownKiwiWrongSample extends Bird{
    /**
     * 几维鸟子类重写了父类的setFlySpeed方法，这违背了里氏替换原则。
     * @param speed
     */
    public void setFlySpeed(double speed){
        flySpeed = 0;
    }
}
