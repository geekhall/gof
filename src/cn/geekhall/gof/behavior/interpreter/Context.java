package cn.geekhall.gof.behavior.interpreter;

/**
 * @author yiny
 * @Type Context.java
 * @Desc 环境类
 * @date 5/1/21 9:01 PM
 */
public class Context {
    private String[] citys = {"北京","上海","广州"};

    private String[] persons = {"老人","妇女","小孩","残疾人"};

    private Expression cityPerson;

    public Context() {
        // 数据初始化
        System.out.println("数据初始化");
        Expression city = new TerminalExpression(citys);
        Expression person = new TerminalExpression(persons);
        cityPerson = new AndExpression(city, person);
    }

    public void operation(String info){
        // 调用相关表达式类的解释方法
        System.out.println("调用相关表达式类的解释方法。");
    }

    void freeRide(String info){
        boolean ok = cityPerson.interpret(info);
        if (ok){
            System.out.println("您是" + info + "， 您本次乘车免费！");
        } else {
            System.out.println(info + "，您不是免费人员，本次乘车收费2元！");
        }
    }
}
