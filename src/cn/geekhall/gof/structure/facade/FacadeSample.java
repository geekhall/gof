package cn.geekhall.gof.structure.facade;

/**
 * @author yiny
 * @Type FacadeSample.java
 * @Desc
 * @date 4/29/21 12:39 PM
 */
public class FacadeSample {
    public static void execute() {
        System.out.println("==================== 结构型模式 5 : 外观模式（Facade） Sample START =====================");
        Facade f = new Facade();
        f.method();
        System.out.println("==================== 结构型模式 5 : 外观模式（Facade） Sample END =====================");

    }
}
