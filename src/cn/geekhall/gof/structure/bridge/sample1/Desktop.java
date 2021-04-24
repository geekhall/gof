package cn.geekhall.gof.structure.bridge.sample1;

/**
 * @author yiny
 * @Type Desktop.java
 * @Desc
 * @date 4/24/21 9:41 PM
 */
public class Desktop extends Computer {

    public Desktop(Brand brand) {
        super(brand);
    }
    @Override
    public void info(){
        super.info();
        System.out.println("台式机");
    }
}
