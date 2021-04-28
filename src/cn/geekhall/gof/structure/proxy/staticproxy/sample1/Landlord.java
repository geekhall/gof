package cn.geekhall.gof.structure.proxy.staticproxy.sample1;

/**
 * @author yiny
 * @Type Landlord.java
 * @Desc 房东类
 * @date 4/24/21 9:59 PM
 */
public class Landlord implements Rent{

    @Override
    public void rent() {
        System.out.println("房东要出租房子。");
    }
}
