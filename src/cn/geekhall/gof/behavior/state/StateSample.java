package cn.geekhall.gof.behavior.state;

import cn.geekhall.gof.behavior.state.sample1.ThreadContext;

/**
 * @author yiny
 * @Type StateSample.java
 * @Desc
 * @date 5/1/21 4:08 PM
 */
public class StateSample {
    public static void execute() {
        System.out.println("==================== 行为型模式 5 : 状态模式（State） Sample START =====================");
        Context context = new Context();
        context.handle();
        context.handle();
        context.handle();
        context.handle();

        System.out.println("-------- Sample1 start ----------");
        ThreadContext threadContext = new ThreadContext();
        threadContext.start();
        threadContext.getCPU();
        threadContext.suspend();
        threadContext.resume();
        threadContext.getCPU();
        threadContext.stop();
        System.out.println("-------- Sample1 end   ----------");
        System.out.println("==================== 行为型模式 5 : 状态模式（State） Sample END   =====================");
        System.out.println();
    }
}
