package cn.geekhall.gof.creation.builder;

/**
 * @author yiny
 * @Type ConcreteBuilder.java
 * @Desc
 * @date 4/24/21 11:28 AM
 */
public class ConcreteBuilderMicrosoft extends Builder {
    @Override
    public void buildCpu() {
        computer.setCpu("Inter i9");
    }

    @Override
    public void buildDisk() {
        computer.setDisk("Normal Disk");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("8G");
    }
}
