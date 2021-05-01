package cn.geekhall.gof.behavior.chainofresponsibility.sample1;

/**
 * @author yiny
 * @Type Headmaster.java
 * @Desc 具体处理者4 ： 校长类
 * @date 5/1/21 3:48 PM
 */
public class Headmaster extends Leader {
    @Override
    public void handleRequest(int leaveDays) {
        if (leaveDays <= 30){
            System.out.println("校长批准你请假" + leaveDays + "天。");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(leaveDays);
            } else {
                System.out.println("请假天数太多，没有人批准该假条！");
            }
        }
    }
}
