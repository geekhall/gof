package cn.geekhall.gof.behavior.iterator;

/**
 * @author yiny
 * @Type Iterator.java
 * @Desc 抽象迭代器
 * @date 5/1/21 7:41 PM
 */
public interface Iterator {
    Object first();
    Object next();
    boolean hasNext();
}