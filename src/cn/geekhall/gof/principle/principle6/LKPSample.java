package cn.geekhall.gof.principle.principle6;

/**
 * @author yiny
 * @Type LKPSample.java
 * @Desc
 * @date 4/22/21 12:50 PM
 */
public class LKPSample {
    public static void execute(){
        System.out.println("==================== Principle 6 : 迪米特法则/最少知识原则 Sample START =====================");
        Agent agent = new Agent();
        agent.setMyStar(new Star("贾玲"));
        agent.setMyFans(new Fans("粉丝A"));
        agent.setMyCompany(new Company("开心麻花"));
        agent.meeting();
        agent.business();
        System.out.println("==================== Principle 6 : 迪米特法则/最少知识原则 Sample END =====================");
        System.out.println("");
    }
}
