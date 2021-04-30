package cn.geekhall.gof.structure.decorator;

/**
 * @author yiny
 * @Type Decorator.java
 * @Desc 抽象装饰角色
 * @date 4/29/21 12:15 PM
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
