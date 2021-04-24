package cn.geekhall.gof.creation.builder;

/**
 * @author yiny
 * @Type Product.java
 * @Desc
 * @date 4/24/21 11:22 AM
 */
public class Computer {
    private String cpu;
    private String memory;
    private String disk;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public void show(){
        System.out.println("这是一台电脑，配置如下： ");
        System.out.println("芯片： " + cpu);
        System.out.println("内存： " + memory);
        System.out.println("硬盘： " + disk);
    }

}
