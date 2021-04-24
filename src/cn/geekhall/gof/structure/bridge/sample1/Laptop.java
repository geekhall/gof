package cn.geekhall.gof.structure.bridge.sample1;

/**
 * @author yiny
 * @Type Laptop.java
 * @Desc
 * @date 4/24/21 9:42 PM
 */
public class Laptop extends Computer {
    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("笔记本");
    }
}
