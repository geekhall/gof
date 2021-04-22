/**
 * @Project : GoF
 * @Package : cn.geekhall.gof.principle.principle5
 * @File : StudentScoreList.java
 * @Descriptioni : TODO
 * @Author : yiny
 * @Date : 2021/4/21 0:27
 */
package cn.geekhall.gof.principle.principle5;

public class StudentScoreList implements InputModule, CountModule, PrintModule{
    public StudentScoreList(){

    }

    public static InputModule getInputModule(){
        return (InputModule) new StudentScoreList();
    }

    public static CountModule getCountModule() {
        return (CountModule) new StudentScoreList();
    }
    public static PrintModule getPrintModule() {
        return (PrintModule) new StudentScoreList();
    }
    public void insert() {
        System.out.println("输入模块的insert()方法被调用！");
    }
    public void delete() {
        System.out.println("输入模块的delete()方法被调用！");
    }
    public void modify() {
        System.out.println("输入模块的modify()方法被调用！");
    }
    public void countTotalScore() {
        System.out.println("统计模块的countTotalScore()方法被调用！");
    }
    public void countAverage() {
        System.out.println("统计模块的countAverage()方法被调用！");
    }
    public void printStudentInfo() {
        System.out.println("打印模块的printStuInfo()方法被调用！");
    }
    public void queryStudentInfo() {
        System.out.println("打印模块的queryStuInfo()方法被调用！");
    }
}
