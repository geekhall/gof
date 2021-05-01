package cn.geekhall.gof.behavior.templatemethod.sample1;

/**
 * @author yiny
 * @Type StudyInAmerycan.java
 * @Desc 具体子类： 日本留学
 * @date 5/1/21 10:40 AM
 */
public class StudyInJapan extends StudyAbroad {

    @Override
    public void lookingForSchool() {
        System.out.println("一.索取日本学校资料");
    }

    @Override
    public void studyLanguage() {
        System.out.println("二.学习语言 - 日语（JLPT）");
    }

    @Override
    public void applyForEnrol() {
        System.out.println("三.日本学校入学申请");
    }

    @Override
    public void arriving() {
        System.out.println("七.抵达日本");
    }
}
