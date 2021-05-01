package cn.geekhall.gof.behavior.visitor;

/**
 * @author yiny
 * @Type ConcreteVisitorB.java
 * @Desc 具体访问者B类
 * @date 5/1/21 8:05 PM
 */
public class ConcreteVisitorB implements Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("具体访问者B访问 ---> " + elementA.operationA());
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("具体访问者B访问 ---> " + elementB.operationB());
    }
}
