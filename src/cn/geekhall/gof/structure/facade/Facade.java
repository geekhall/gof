package cn.geekhall.gof.structure.facade;

/**
 * @author yiny
 * @Type Facade.java
 * @Desc 外观角色
 * @date 4/29/21 12:36 PM
 */
class Facade {
    private SubSystem01 obj1 = new SubSystem01();
    private SubSystem02 obj2 = new SubSystem02();
    private SubSystem03 obj3 = new SubSystem03();

    void method(){
        obj1.method1();
        obj2.method2();
        obj3.method3();
    }
}
