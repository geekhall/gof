package cn.geekhall.gof.behavior.visitor;

/**
 * @author yiny
 * @Type Element.java
 * @Desc 抽象元素类
 * @date 5/1/21 8:05 PM
 */
public interface Element {
    void accept(Visitor visitor);
}
