package cn.geekhall.gof.structure.adapter.twoway;

/**
 * @author yiny
 * @Type TargetRealize.java
 * @Desc
 * @date 4/24/21 7:08 PM
 */
public class TargetRealize implements TwoWayTarget {
    @Override
    public void request() {
        System.out.println("目标代码被调用。。。");
    }
}
