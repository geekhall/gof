package cn.geekhall.gof.behavior.state.sample1;

/**
 * @author yiny
 * @Type Running.java
 * @Desc 具体状态类：运行状态
 * @date 5/1/21 4:28 PM
 */
class Running extends ThreadState{
    Running() {
        stateName = "运行状态";
        System.out.println("当前线程处于：运行状态。");
    }

    void suspend(ThreadContext context){
        System.out.print("调用suspend()方法 --> ");
        if (stateName.equals("运行状态")){
            context.setThreadState(new Blocked());
        } else {
            System.out.println("当前状态不是运行状态，不能调用suspend()方法。");
        }
    }

    void stop(ThreadContext context){
        System.out.print("调用stop()方法 --> ");
        if (stateName.equals("运行状态")){
            context.setThreadState(new Dead());
        } else {
            System.out.println("当前状态不是运行状态，stop()方法。");
        }
    }
}
