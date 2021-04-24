package cn.geekhall.gof.structure.bridge;

/**
 * @author yiny
 * @Type ConcreteImplementroA.java
 * @Desc 具体实现化角色
 * @date 4/24/21 8:54 PM
 */
public class ConcreteImplementorA implements Implementor{
    @Override
    public void operationImpl() {
        System.out.println("具体实现化ConcreteImplementorA 角色被访问。。。");
    }
}
