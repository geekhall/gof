package cn.geekhall.gof.structure.decorator;

/**
 * @author yiny
 * @Type ConcreteDecorator.java
 * @Desc 具体装饰角色。
 * @date 4/29/21 12:17 PM
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void operation(){
        super.operation();
        addedFunction();
    }

    public void addedFunction(){
        System.out.println("为具体构件角色增加额外的功能。addedFunction()");
    }
}
