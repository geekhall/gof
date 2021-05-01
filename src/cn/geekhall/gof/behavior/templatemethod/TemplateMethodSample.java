package cn.geekhall.gof.behavior.templatemethod;

import cn.geekhall.gof.behavior.templatemethod.sample1.StudyAbroad;
import cn.geekhall.gof.behavior.templatemethod.sample1.StudyInAmerycan;
import cn.geekhall.gof.behavior.templatemethod.sample1.StudyInJapan;
import cn.geekhall.gof.behavior.templatemethod.sample2.HookAbstractClass;
import cn.geekhall.gof.behavior.templatemethod.sample2.HookConcreteClass;

/**
 * @author yiny
 * @Type TemplateMethodSample.java
 * @Desc
 * @date 5/1/21 10:28 AM
 */
public class TemplateMethodSample {
    public static void execute() {
        System.out.println("==================== 行为型模式 1 : 模版方法模式（TemplateMethod） Sample START =====================");
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.templateMethod();
        System.out.println("-----------sample 1 start -------------");
        StudyAbroad studyInAmerycan = new StudyInAmerycan();
        studyInAmerycan.templateMethod();
        System.out.println("----------");
        StudyAbroad studyInJapan = new StudyInJapan();
        studyInJapan.templateMethod();
        System.out.println("-----------sample 1 end   -------------");
        System.out.println("");
        System.out.println("-----------sample 2 start -------------");
        HookAbstractClass hookAbstractClass1 = new HookConcreteClass(false);
        hookAbstractClass1.templateMethod();
        System.out.println("----------");
        HookAbstractClass hookAbstractClass2 = new HookConcreteClass(true);
        hookAbstractClass2.templateMethod();
        System.out.println("-----------sample 2 end   -------------");
        System.out.println("==================== 行为型模式 1 : 模版方法模式（TemplateMethod） Sample End =====================");
    }
}
