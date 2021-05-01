package cn.geekhall.gof.behavior.templatemethod.sample2;

/**
 * @author yiny
 * @Type HookConcreteClass.java
 * @Desc 钩子方法的具体子嘞
 * @date 5/1/21 10:57 AM
 */
public class HookConcreteClass extends HookAbstractClass {
    private boolean hook;

    public HookConcreteClass(boolean hook) {
        this.hook = hook;
    }

    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用。");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用。");
    }

    @Override
    public void hookMethod1() {
        System.out.println("钩子方法1被重写");
    }

    @Override
    public boolean hookMethod2() {
        return hook;
    }
}
