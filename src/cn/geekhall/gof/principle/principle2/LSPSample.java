/**
 * @Project : GoF
 * @Package : cn.geekhall.gof.principle.principle2
 * @File : LSPSample.java
 * @Descriptioni : TODO
 * @Author : yiny
 * @Date : 2021/4/20 22:12
 */
package cn.geekhall.gof.principle.principle2;

public class LSPSample {
    public static void execute(){
        System.out.println("==================== 里氏替换原则 Sample START =====================");
        Bird swallow = new Swallow();
        Bird brownKiwi = new BrownKiwiWrongSample();

        swallow.setFlySpeed(120);
        brownKiwi.setFlySpeed(120);

        System.out.println("如果飞行300公里：");

        try {
            System.out.println("燕子将飞行：" + swallow.getFlyTime(300) + "小时。");
            System.out.println("几维鸟将飞行：" + brownKiwi.getFlyTime(300) + "小时。");
        } catch (Exception err){
            System.out.println("发生错误了");
        }
        System.out.println("==================== 里氏替换原则 Sample END =====================");
    }
}
