package cn.geekhall.gof.behavior.strategy;

/**
 * @author yiny
 * @Type Context.java
 * @Desc 环境类
 * @date 5/1/21 11:14 AM
 */
public class Context {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    void strategyMethod(){
        strategy.strategyMethod();
    }
}
