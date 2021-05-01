package cn.geekhall.gof.behavior.chainofresponsibility;

/**
 * @author yiny
 * @Type ConcreteHandler1.java
 * @Desc 具体处理角色2
 * @date 5/1/21 3:30 PM
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("two")) {
            System.out.println("具体处理者2负责处理该请求。");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
