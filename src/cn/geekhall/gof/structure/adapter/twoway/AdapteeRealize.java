package cn.geekhall.gof.structure.adapter.twoway;

/**
 * @author yiny
 * @Type AdapteeRealize.java
 * @Desc
 * @date 4/24/21 7:08 PM
 */
public class AdapteeRealize implements TwoWayAdaptee {
    @Override
    public void specificRequest() {
        System.out.println("适配者代码被调用。。。");
    }
}
