package cn.geekhall.gof.structure.adapter.sample1;

/**
 * @author yiny
 * @Type ElectricAdapter.java
 * @Desc
 * @date 4/24/21 6:56 PM
 */
public class ElectricAdapter implements Motor {
    private ElectricMotor emotor;
    @Override
    public void drive() {
        emotor.electricDrive();
    }

    public ElectricAdapter() {
        this.emotor = new ElectricMotor();
    }
}
