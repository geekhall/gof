/**
 * @Project : GoF
 * @Package : cn.geekhall.gof.principle.principle4
 * @File : StudentWork1.java
 * @Descriptioni : TODO
 * @Author : yiny
 * @Date : 2021/4/21 0:14
 */
package cn.geekhall.gof.principle.principle4;

/**
 * bad sample
 * 大学学生工作主要包括学生生活辅导和学生学业指导两个方面的工作，其中:
 * 生活辅导主要包括出勤统计、心理辅导、班级管理等工作，
 * 学业指导主要包括就业指导、学习辅导、科研指导等工作。
 * 如果将这些工作交给一位老师负责显然不合理，
 * 正确的做 法是生活辅导由辅导员负责，学业指导由学业导师负责，
 */
public class StudentWork1 {
    /**
     * 心理辅导
     */
    public void psychologicalGuidance(){
        System.out.println("心理辅导");
    }

    /**
     * 班级管理
     */
    public void classManagement(){
        System.out.println("班级管理");
    }

    /**
     * 出勤统计
     */
    public void attendenceStatistic(){
        System.out.println("出勤统计");
    }

    /**
     * 科研指导
     */
    public void research(){
        System.out.println("科研指导");
    }

    /**
     * 学业指导
     */
    public void teach(){
        System.out.println("学业指导");
    }

    /**
     * 就业指导
     */
    public void employmentGuidance(){
        System.out.println("就业指导");
    }
}
