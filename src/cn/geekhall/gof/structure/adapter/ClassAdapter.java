package cn.geekhall.gof.structure.adapter;

/**
 * @author yiny
 * @Type Class.java
 * @Desc
 * @date 4/24/21 6:31 PM
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}
