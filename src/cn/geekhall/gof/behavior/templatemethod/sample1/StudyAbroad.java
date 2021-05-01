package cn.geekhall.gof.behavior.templatemethod.sample1;

/**
 * @author yiny
 * @Type StudyAbroad.java
 * @Desc 抽象类：出国留学
 * @date 5/1/21 10:34 AM
 */
public abstract class StudyAbroad {
    public void templateMethod(){
        lookingForSchool(); // 索取学校资料
        studyLanguage();    // 学习外语
        applyForEnrol();    // 入学申请
        applyForPassport(); // 申请护照
        applyForVisa();     // 申请签证
        readyGoAbroad();    // 准备工作
        arriving();         // 抵达
    }

    private void applyForPassport() {
        System.out.println("四.办理因私出国护照、出境卡和公证：");
    }

    private void applyForVisa() {
        System.out.println("五.申请签证：");
    }

    private void readyGoAbroad() {
        System.out.println("六.体检、订机票、准备行装：");
    }

    public abstract void studyLanguage();   // 学习语言
    public abstract void lookingForSchool();// 索取学校资料
    public abstract void applyForEnrol();   // 入学申请
    public abstract void arriving();        // 抵达
}
