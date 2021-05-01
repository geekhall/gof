package cn.geekhall.gof.behavior.visitor;

/**
 * @author yiny
 * @Type ConcreteVisitorA.java
 * @Desc 具体访问者A类
 * @date 5/1/21 8:04 PM
 */
public class ConcreteVisitorA implements Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("具体访问者A访问 ---> " + elementA.operationA());
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("具体访问者A访问 ---> " + elementB.operationB());
    }
}
