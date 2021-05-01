package cn.geekhall.gof.behavior.state.sample1;

/**
 * @author yiny
 * @Type Runnable.java
 * @Desc 具体状态类： 就绪状态
 * @date 5/1/21 4:25 PM
 */
class Runnable extends ThreadState{
    Runnable(){
        stateName = "就绪状态";
        System.out.println("当前线程处于：就绪状态。");
    }

    void getCPU(ThreadContext context){
        System.out.print("获得CPU时间 --> ");
        if (stateName.equals("就绪状态") ){
            context.setThreadState(new Running());
        } else {
            System.out.println("当前线程不是就绪状态，不能获取CPU.");
        }
    }
}
