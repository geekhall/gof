package cn.geekhall.gof.structure.bridge.sample1;

/**
 * @author yiny
 * @Type Huawei.java
 * @Desc
 * @date 4/24/21 9:38 PM
 */
public class Huawei implements Brand {
    @Override
    public void info() {
        System.out.print("华为");
    }
}
