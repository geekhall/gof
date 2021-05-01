/**
 * @Project : GoF
 * @Package : cn.geekhall.gof.principle.principle4
 * @File : BadSample.java
 * @Descriptioni : TODO
 * @Author : yiny
 * @Date : 2021/4/20 23:55
 */
package cn.geekhall.gof.principle.principle4;

/**
 * 大学学生工作主要包括学生生活辅导和学生学业指导两个方面的工作，其中:
 * 生活辅导主要包括出勤统计、心理辅导、班级管理等工作，
 * 学业指导主要包括就业指导、学习辅导、科研指导等工作。
 * 如果将这些工作交给一位老师负责显然不合理，
 * 正确的做 法是生活辅导由辅导员负责，学业指导由学业导师负责，
 *
 */
class StudentWork {
    /**
     * 生活辅导
     */
    void lifeSupport(Assistant assistant){
        assistant.attendenceStatistic();
        assistant.classManagement();
        assistant.psychologicalGuidance();
    }

    /**
     * 学业辅导
     */
    void studySupport(Teacher teacher){
        teacher.teach();
        teacher.research();
        teacher.employmentGuidance();
    }
}

