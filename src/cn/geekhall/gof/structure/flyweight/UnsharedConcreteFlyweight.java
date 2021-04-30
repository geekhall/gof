package cn.geekhall.gof.structure.flyweight;

/**
 * @author yiny
 * @Type UnsharedConcreteFlyweight.java
 * @Desc 非享元角色
 * @date 4/29/21 12:48 PM
 */
public class UnsharedConcreteFlyweight {
    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
