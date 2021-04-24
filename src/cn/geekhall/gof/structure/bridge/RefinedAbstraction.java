package cn.geekhall.gof.structure.bridge;

/**
 * @author yiny
 * @Type RefinedAbstraction.java
 * @Desc
 * @date 4/24/21 9:24 PM
 */
public class RefinedAbstraction extends Abstraction {
    protected RefinedAbstraction(Implementor implementor){
        super(implementor);
    }
    @Override
    public void operation() {
        System.out.println("扩展抽象化RefinedAbstraction角色被访问");
        implementor.operationImpl();
    }
}
