package cn.geekhall.gof.behavior.strategy;

/**
 * @author yiny
 * @Type ConcreteStrategyA.java
 * @Desc 具体策略B
 * @date 5/1/21 11:12 AM
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体的策略B的策略方法被访问。");
    }
}
