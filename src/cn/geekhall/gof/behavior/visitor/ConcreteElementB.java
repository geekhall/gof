package cn.geekhall.gof.behavior.visitor;

/**
 * @author yiny
 * @Type ConcreteElementB.java
 * @Desc 具体元素B类
 * @date 5/1/21 8:23 PM
 */
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    String operationB() {
        return "具体元素B的操作";
    }
}
