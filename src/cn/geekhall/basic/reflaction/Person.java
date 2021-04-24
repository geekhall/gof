package cn.geekhall.basic.reflaction;

/**
 * @author yiny
 * @Type Person.java
 * @Desc
 * @date 4/24/21 2:56 PM
 */
public class Person {
    public String name;
    protected String age;
    private String hoby;

    public Person() {
    }

    public Person(String name, String age, String hoby) {
        this.name = name;
        this.age = age;
        this.hoby = hoby;
    }

    public String getHoby() {
        return hoby;
    }
}
