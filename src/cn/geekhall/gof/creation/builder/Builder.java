package cn.geekhall.gof.creation.builder;

/**
 * @author yiny
 * @Type Builder.java
 * @Desc
 * @date 4/24/21 11:25 AM
 */
public abstract class Builder {
    // 创建产品对象
    protected Computer computer = new Computer();

    public abstract void buildCpu();
    public abstract void buildDisk();
    public abstract void buildMemory();
    Computer getResult(){
        return computer;
    }
}
