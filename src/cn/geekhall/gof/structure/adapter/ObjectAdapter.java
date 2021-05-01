package cn.geekhall.gof.structure.adapter;

/**
 * @author yiny
 * @Type ObjectAdapter.java
 * @Desc
 * @date 4/24/21 6:38 PM
 */
public class ObjectAdapter implements Target{
    // 被适配者
    private Adaptee adaptee;

    ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
