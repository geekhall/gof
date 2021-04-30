package cn.geekhall.gof.structure.flyweight;

/**
 * @author yiny
 * @Type ConcreteFlyweight.java
 * @Desc
 * @date 4/29/21 12:50 PM
 */
public class ConcreteFlyweight implements Flyweight {
    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("具体享元" + key + "被创建！");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight state) {
        System.out.println("具体享元" + key + "被调用！");
        System.out.println("非享元信息是：" + state.getInfo());
    }
}
