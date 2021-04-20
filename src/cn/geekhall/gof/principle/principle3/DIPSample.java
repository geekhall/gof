/**
 * @Project : GoF
 * @Package : cn.geekhall.gof.principle.principle3
 * @File : DIPSample.java
 * @Descriptioni : TODO
 * @Author : yiny
 * @Date : 2021/4/20 23:03
 */
package cn.geekhall.gof.principle.principle3;

public class DIPSample {
    public static void execute(){
        System.out.println("==================== 依赖倒置原则 Sample START =====================");
        Customer wang = new Customer();
        System.out.println("顾客王先森逛了以下这些商场：");
        wang.shopping(new JingDong());
        wang.shopping(new TaoBao());
        wang.shopping(new PinDuoDuo());
        System.out.println("==================== 依赖倒置原则 Sample END =====================");
    }
}
