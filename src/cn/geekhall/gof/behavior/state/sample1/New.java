package cn.geekhall.gof.behavior.state.sample1;

/**
 * @author yiny
 * @Type New.java
 * @Desc 具体状态类：新建状态
 * @date 5/1/21 4:16 PM
 */
public class New extends ThreadState {
    New() {
        stateName = "新建状态";
        System.out.println("当前线程处于：新建状态。");
    }

    public void start(ThreadContext context){
        System.out.print("调用start()方法 --> ");
        if (stateName.equals("新建状态")) {
            context.setThreadState(new Runnable());
        } else {
            System.out.println("当前线程不是新建状态，不能调用start()方法.");
        }
    }
}
