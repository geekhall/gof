/**
 * @Project : GoF
 * @Package : cn.geekhall.gof.principle.principle4
 * @File : SRPSample.java
 * @Descriptioni : TODO
 * @Author : yiny
 * @Date : 2021/4/21 0:16
 */
package cn.geekhall.gof.principle.principle4;

public class SRPSample {
    public static void execute(){
        System.out.println("==================== Principle 4 : 单一职责原则 Sample START =====================");
        System.out.println("Bad Sample");
        StudentWork1 studentWork1 = new StudentWork1();
        studentWork1.attendenceStatistic();
        studentWork1.classManagement();
        studentWork1.employmentGuidance();
        studentWork1.psychologicalGuidance();
        studentWork1.research();
        studentWork1.teach();

        System.out.println("Good Sample");
        Teacher teacher = new Teacher();
        Assistant assistant = new Assistant();
        StudentWork studentWork = new StudentWork();
        studentWork.lifeSupport(assistant);
        studentWork.studySupport(teacher);
        System.out.println("==================== Principle 4 : 单一职责原则 Sample END =====================");
        System.out.println("");
    }
}
