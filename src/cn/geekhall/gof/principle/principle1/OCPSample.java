/**
 * @Project : GoF
 * @Package : cn.geekhall.gof.principle.principle1
 * @File : KBSample.java
 * @Descriptioni : TODO
 * @Author : yiny
 * @Date : 2021/4/20 22:16
 */
package cn.geekhall.gof.principle.principle1;

public class OCPSample {
    public static void execute(){
        System.out.println("==================== 开闭原则 Sample START =====================");
        WindowsSample sample = new WindowsSample();
        sample.setSubject(new SpecificSubjectA());
        sample.display();
        sample.setSubject(new SpecificSubjectB());
        sample.display();
        System.out.println("==================== 开闭原则 Sample END =====================");
    }
}
