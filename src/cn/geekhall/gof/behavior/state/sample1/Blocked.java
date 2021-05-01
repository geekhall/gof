package cn.geekhall.gof.behavior.state.sample1;

/**
 * @author yiny
 * @Type Blocked.java
 * @Desc 具体状态类： 阻塞状态
 * @date 5/1/21 4:28 PM
 */
class Blocked extends ThreadState {
    Blocked() {
        stateName = "阻塞状态";
        System.out.println("当前进程处于：阻塞状态。");
    }

    void resume(ThreadContext context){
        System.out.print("调用resume()方法 --> ");
        if ( stateName.equals("阻塞状态")){
            context.setThreadState(new Runnable());
        } else {
            System.out.println("当前线程不是阻塞状态，不能调用resume() 方法。");
        }
    }
}
