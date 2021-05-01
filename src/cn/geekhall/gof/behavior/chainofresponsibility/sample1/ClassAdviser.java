package cn.geekhall.gof.behavior.chainofresponsibility.sample1;

/**
 * @author yiny
 * @Type ClassAdviser.java
 * @Desc 具体处理者1 ： 班主任类
 * @date 5/1/21 3:48 PM
 */
public class ClassAdviser extends Leader {
    @Override
    public void handleRequest(int leaveDays) {
        if (leaveDays <= 2){
            System.out.println("班主任批准你请假" + leaveDays + "天。");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(leaveDays);
            } else {
                System.out.println("请假天数太多，没有人批准该假条！");
            }
        }
    }
}
