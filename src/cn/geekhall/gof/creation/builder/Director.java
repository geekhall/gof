package cn.geekhall.gof.creation.builder;

/**
 * @author yiny
 * @Type Directory.java
 * @Desc 指挥者类，调用建造者的方法完成复杂对象的创建。
 * @date 4/24/21 11:35 AM
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    // 产品构建与组装方法
    Computer construct(){
        builder.buildCpu();
        builder.buildDisk();
        builder.buildMemory();
        return builder.getResult();
    }
}
