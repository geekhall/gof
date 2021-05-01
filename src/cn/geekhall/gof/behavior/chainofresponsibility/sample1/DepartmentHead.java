package cn.geekhall.gof.behavior.chainofresponsibility.sample1;

/**
 * @author yiny
 * @Type DepartmentHead.java
 * @Desc 具体处理者2 ： 系主任类
 * @date 5/1/21 3:48 PM
 */
public class DepartmentHead extends Leader {
    @Override
    public void handleRequest(int leaveDays) {
        if (leaveDays <= 10){
            System.out.println("系主任批准你请假" + leaveDays + "天。");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(leaveDays);
            } else {
                System.out.println("请假天数太多，没有人批准该假条！");
            }
        }
    }
}
