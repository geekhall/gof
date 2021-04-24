package cn.geekhall.gof.structure.bridge.sample1;

/**
 * @author yiny
 * @Type Apple.java
 * @Desc
 * @date 4/24/21 9:38 PM
 */
public class Apple implements Brand {
    @Override
    public void info() {
        System.out.print("苹果");
    }
}
