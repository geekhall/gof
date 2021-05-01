package cn.geekhall.gof.behavior.visitor;

/**
 * @author yiny
 * @Type Visitor.java
 * @Desc
 * @date 5/1/21 8:04 PM
 */
public interface Visitor {
    void visit(ConcreteElementA elementA);

    void visit(ConcreteElementB elementB);
}
