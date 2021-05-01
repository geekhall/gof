package cn.geekhall.gof.behavior.visitor;

/**
 * @author yiny
 * @Type ConcreteElementA.java
 * @Desc 具体元素A类
 * @date 5/1/21 8:23 PM
 */
public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    String operationA(){
        return "具体元素A的操作";
    }
}
