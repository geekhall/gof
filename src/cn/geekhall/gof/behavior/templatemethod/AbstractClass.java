package cn.geekhall.gof.behavior.templatemethod;

/**
 * @author yiny
 * @Type AbstractClass.java
 * @Desc 抽象类
 * @date 5/1/21 10:23 AM
 */
public abstract class AbstractClass {
    /**
     * 模版方法
     */
    public void templateMethod(){
        specificMethod();
        abstractMethod1();
        abstractMethod2();
    }

    // 具体方法
    public void specificMethod(){
        System.out.println("抽象类重的具体方法被调用。");
    }

    // 抽象方法
    public abstract void abstractMethod1();

    // 抽象方法
    public abstract void abstractMethod2();
    ;


}
