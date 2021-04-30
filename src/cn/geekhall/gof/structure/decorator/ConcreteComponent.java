package cn.geekhall.gof.structure.decorator;

/**
 * @author yiny
 * @Type ConcreteComponent.java
 * @Desc 具体构件角色
 * @date 4/29/21 12:11 PM
 */
public class ConcreteComponent implements Component {

    public ConcreteComponent() {
        System.out.println("创建具体构件角色。");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()。");
    }

}
