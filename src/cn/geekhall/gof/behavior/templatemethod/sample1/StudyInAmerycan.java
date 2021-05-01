package cn.geekhall.gof.behavior.templatemethod.sample1;

/**
 * @author yiny
 * @Type StudyInAmerycan.java
 * @Desc 具体子类： 美国留学
 * @date 5/1/21 10:40 AM
 */
public class StudyInAmerycan extends StudyAbroad {
    @Override
    public void studyLanguage() {
        System.out.println("二.学习语言 - 英语（托福、雅思）");
    }

    @Override
    public void lookingForSchool() {
        System.out.println("一.索取美国学校资料");
    }

    @Override
    public void applyForEnrol() {
        System.out.println("三.美国学校入学申请");
    }

    @Override
    public void arriving() {
        System.out.println("七.抵达美国");
    }
}
