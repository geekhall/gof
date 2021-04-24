package cn.geekhall.gof.structure.adapter.sample1;

/**
 * @author yiny
 * @Type OpticalAdapter.java
 * @Desc
 * @date 4/24/21 6:59 PM
 */
public class OpticalAdapter implements Motor {
    private OpticalMotor omotor;

    @Override
    public void drive() {
        omotor.opticalDrive();
    }

    public OpticalAdapter() {
        omotor = new OpticalMotor();
    }
}
