package cn.geekhall.gof.principle.principle5;

/**
 * @author yiny
 * @Type ISPSample.java
 * @Desc
 * @date 4/22/21 12:34 PM
 */
public class ISPSample {
    public static void execute(){
        System.out.println("==================== Principle 5 : 接口隔离原则 Sample START =====================");
        StudentScoreList studentScoreList = new StudentScoreList();
        studentScoreList.insert();
        studentScoreList.modify();
        studentScoreList.delete();
        System.out.println("==================== Principle 5 : 接口隔离原则 Sample END =====================");
        System.out.println("");
    }
}
