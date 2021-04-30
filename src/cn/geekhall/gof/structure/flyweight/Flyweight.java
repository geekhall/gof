package cn.geekhall.gof.structure.flyweight;

/**
 * @author yiny
 * @Type Flyweight.java
 * @Desc 抽象享元角色
 * @date 4/29/21 12:47 PM
 */
public interface Flyweight {
    void operation(UnsharedConcreteFlyweight state);
}
