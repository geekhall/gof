package cn.geekhall.gof.behavior.iterator;

/**
 * @author yiny
 * @Type Aggregate.java
 * @Desc 抽象聚合
 * @date 5/1/21 7:40 PM
 */
public interface Aggregate {
    void add(Object object);
    void remove(Object object);
    Iterator getIterator();
}
