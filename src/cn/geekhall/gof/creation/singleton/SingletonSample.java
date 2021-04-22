package cn.geekhall.gof.creation.singleton;

/**
 * @author yiny
 * @Type SingletonSample.java
 * @Desc
 * @date 4/22/21 8:01 PM
 */
public class SingletonSample {
    public static void execute(){
        System.out.println("==================== 创建型模式 1 : 单例模式（Singleton） Sample START =====================");
        NormalClass normalInstanceA = new NormalClass();
        NormalClass normalInstanceB = new NormalClass();
        System.out.println(normalInstanceA == normalInstanceB);

        HungrySingleton hungrySingleton = HungrySingleton.getInstance();

        System.out.println("==================== 创建型模式 1 : 单例模式（Singleton） Sample END =====================");

    }
}
