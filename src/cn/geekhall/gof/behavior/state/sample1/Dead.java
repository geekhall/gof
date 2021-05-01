package cn.geekhall.gof.behavior.state.sample1;

/**
 * @author yiny
 * @Type Dead.java
 * @Desc 具体状态类：死亡状态
 * @date 5/1/21 4:28 PM
 */
public class Dead extends ThreadState {
    public Dead() {
        stateName = "死亡状态";
        System.out.println("当前线程处于：死亡状态。");
    }
}
