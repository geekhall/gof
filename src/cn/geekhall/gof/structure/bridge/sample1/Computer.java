package cn.geekhall.gof.structure.bridge.sample1;

/**
 * @author yiny
 * @Type Computer.java
 * @Desc 抽象的电脑类型
 * @date 4/24/21 9:39 PM
 */
public abstract class Computer {
    // 使用组合， 品牌
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info(){
        // 输出品牌信息
        brand.info();
    }
}
