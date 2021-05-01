package cn.geekhall.gof.behavior.chainofresponsibility;

/**
 * @author yiny
 * @Type Handler.java
 * @Desc
 * @date 5/1/21 3:27 PM
 */
public abstract class Handler {
    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(String request);

}
