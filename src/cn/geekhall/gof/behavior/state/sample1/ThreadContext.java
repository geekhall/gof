package cn.geekhall.gof.behavior.state.sample1;

/**
 * @author yiny
 * @Type ThreadContext.java
 * @Desc 线程环境类
 * @date 5/1/21 4:19 PM
 */
public class ThreadContext {
    private ThreadState threadState;

    public ThreadContext() {
        this.threadState = new New();
    }

    public ThreadState getThreadState() {
        return threadState;
    }

    void setThreadState(ThreadState threadState) {
        this.threadState = threadState;
    }

    public void start(){
        ((New)threadState).start(this);
    }

    public void getCPU(){
        ((Runnable)threadState).getCPU(this);
    }

    public void suspend(){
        ((Running)threadState).suspend(this);
    }

    public void stop(){
        ((Running)threadState).stop(this);
    }

    public void resume(){
        ((Blocked)threadState).resume(this);
    }
}
