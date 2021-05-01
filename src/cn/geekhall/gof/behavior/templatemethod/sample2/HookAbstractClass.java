package cn.geekhall.gof.behavior.templatemethod.sample2;

/**
 * @author yiny
 * @Type HookAbstractClass.java
 * @Desc 包含钩子方法的抽象类
 * @date 5/1/21 10:53 AM
 */
public abstract class HookAbstractClass {

    // 模版方法
    public void templateMethod(){
        abstractMethod1();
        hookMethod1();
        if (hookMethod2()){
            specificMethod();
        }
        abstractMethod2();
    }

    // 具体方法
    public void specificMethod(){
        System.out.println("抽象类中的具体方法被调用。");
    }

    // 钩子方法1
    public void hookMethod1(){

    }

    // 钩子方法2
    public boolean hookMethod2(){
        return true;
    }

    // 抽象方法1
    public abstract void abstractMethod1();

    // 抽象方法2
    public abstract void abstractMethod2();
}
