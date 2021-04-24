package cn.geekhall.gof.structure.adapter.twoway;

/**
 * @author yiny
 * @Type TwoWayAdapter.java
 * @Desc
 * @date 4/24/21 7:09 PM
 */
public class TwoWayAdapter implements TwoWayAdaptee, TwoWayTarget {
    private TwoWayAdaptee adaptee;
    private TwoWayTarget target;

    public TwoWayAdapter(TwoWayAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    public TwoWayAdapter(TwoWayTarget target) {
        this.target = target;
    }

    @Override
    public void specificRequest() {
        target.request();
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
