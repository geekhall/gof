package cn.geekhall.gof.creation.builder;

/**
 * @author yiny
 * @Type ConcreteBuilder.java
 * @Desc
 * @date 4/24/21 11:28 AM
 */
public class ConcreteBuilderApple extends Builder {
    @Override
    public void buildCpu() {
        computer.setCpu("M1");
    }

    @Override
    public void buildDisk() {
        computer.setDisk("SSD");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("16G");
    }
}
