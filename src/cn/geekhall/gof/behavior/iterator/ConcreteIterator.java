package cn.geekhall.gof.behavior.iterator;

import java.util.List;

/**
 * @author yiny
 * @Type ConcreteIterator.java
 * @Desc 具体迭代器
 * @date 5/1/21 7:44 PM
 */
public class ConcreteIterator implements Iterator {
    private List<Object> list = null;
    private int index = -1;

    ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object first() {
        return list.get(0);
    }

    @Override
    public Object next() {
        return this.hasNext() ? list.get(++index) : null;
    }

    @Override
    public boolean hasNext() {
        return index < list.size() - 1;
    }
}
