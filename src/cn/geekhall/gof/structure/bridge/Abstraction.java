package cn.geekhall.gof.structure.bridge;

/**
 * @author yiny
 * @Type Abstraction.java
 * @Desc 抽象化角色
 * @date 4/24/21 8:56 PM
 */
public abstract class Abstraction {
    Implementor implementor;

    protected Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}
