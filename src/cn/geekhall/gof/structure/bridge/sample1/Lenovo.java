package cn.geekhall.gof.structure.bridge.sample1;

/**
 * @author yiny
 * @Type Lenovo.java
 * @Desc
 * @date 4/24/21 9:44 PM
 */
public class Lenovo implements Brand {
    @Override
    public void info() {
        System.out.print("联想");
    }
}
