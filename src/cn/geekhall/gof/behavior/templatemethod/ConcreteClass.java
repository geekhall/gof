package cn.geekhall.gof.behavior.templatemethod;

/**
 * @author yiny
 * @Type ConcreteClass.java
 * @Desc
 * @date 5/1/21 10:27 AM
 */
public class ConcreteClass extends AbstractClass {

    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的具体实现被调用。。。");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的具体实现被调用。。。");
    }
}
