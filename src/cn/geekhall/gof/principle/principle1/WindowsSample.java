/**
 * @Project : GoF
 * @Package : cn.geekhall.gof.principle.princle1
 * @File : WindowsSample.java
 * @Descriptioni : 原则1：开闭原则，对扩展开放，对修改关闭。
 * @Author : yiny
 * @Date : 2021/4/20 21:56
 */
package cn.geekhall.gof.principle.principle1;

public class WindowsSample {
    public AbstractSubject getSubject() {
        return subject;
    }

    public void setSubject(AbstractSubject subject) {
        this.subject = subject;
    }

    private AbstractSubject subject;
    void display(){
        subject.display();
    }
}
