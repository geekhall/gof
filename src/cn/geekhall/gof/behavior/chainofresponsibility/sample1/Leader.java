package cn.geekhall.gof.behavior.chainofresponsibility.sample1;

/**
 * @author yiny
 * @Type Leader.java
 * @Desc 抽象处理者：领导类
 * @date 5/1/21 3:46 PM
 */
public abstract class Leader {
    private Leader next;

    public Leader getNext() {
        return next;
    }

    public void setNext(Leader next) {
        this.next = next;
    }

    public abstract void handleRequest(int leaveDays);
}
