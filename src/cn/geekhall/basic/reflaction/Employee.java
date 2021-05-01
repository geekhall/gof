package cn.geekhall.basic.reflaction;

/**
 * @author yiny
 * @Type Employee.java
 * @Desc
 * @date 4/24/21 2:58 PM
 */
public class Employee extends Person {
    // 总员工数
    static Integer totalEmployeeNum = 0;

    // 员工编号
    int empNo;

    // 职位
    String position;

    // 薪水
    private double salary;

    // 这里的publis不能去掉，在Sample中使用了反射来获取sayHello方法，去掉publis会抛出NoSuchMethod异常。
    public void sayHello(){
        System.out.println(String.format("你好，我是 %s， 今年 %s 岁， 爱好是 %s，我目前的工作是 %s, 月入 %s 元",
                name, age, getHoby(), position, salary));
    }
    public void work(){
        System.out.println(String.format("My name is %s , 工作中请勿打扰!", name));
    }

    Employee(String name, String age, String hoby, int empNo, String position, double salary) {
        super(name, age, hoby);
        this.empNo = empNo;
        this.position = position;
        this.salary = salary;
        Employee.totalEmployeeNum++;
    }

}
