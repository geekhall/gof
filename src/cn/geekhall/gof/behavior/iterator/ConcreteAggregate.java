package cn.geekhall.gof.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yiny
 * @Type ConcreteAggregate.java
 * @Desc
 * @date 5/1/21 7:43 PM
 */
public class ConcreteAggregate implements Aggregate{
    private List<Object> list = new ArrayList<Object>();

    @Override
    public void add(Object object) {
        list.add(object);
    }

    @Override
    public void remove(Object object) {
        list.remove(object);
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(list);
    }
}
