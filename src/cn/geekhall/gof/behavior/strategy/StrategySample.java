package cn.geekhall.gof.behavior.strategy;

/**
 * @author yiny
 * @Type StrategySample.java
 * @Desc
 * @date 5/1/21 11:15 AM
 */
public class StrategySample {

    public static void execute() {
        System.out.println("==================== 行为型模式 2 : 策略模式（Strategy） Sample START =====================");
        Context c = new Context();
        Strategy strategyA = new ConcreteStrategyA();
        c.setStrategy(strategyA);
        c.strategyMethod();
        System.out.println("--------------");
        Strategy strategyB = new ConcreteStrategyB();
        c.setStrategy(strategyB);
        c.strategyMethod();
        System.out.println("==================== 行为型模式 2 : 策略模式（Strategy） Sample END   =====================");
        System.out.println();
    }
}
