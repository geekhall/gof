package cn.geekhall.gof.creation.singleton;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println(normalInstanceA);
        System.out.println(normalInstanceB);
        System.out.println("normalInstanceA == normalInstanceB ：" + String.valueOf(normalInstanceA == normalInstanceB));
        System.out.println("normalInstanceA.equals(normalInstanceB) : " + String.valueOf(normalInstanceA.equals(normalInstanceB)) );

        HungrySingleton hungrySingletonA = HungrySingleton.getInstance();
        HungrySingleton hungrySingletonB = HungrySingleton.getInstance();
        System.out.println(hungrySingletonA);
        System.out.println(hungrySingletonB);
        System.out.println("hungrySingletonA == hungrySingletonB : " + String.valueOf(hungrySingletonA == hungrySingletonB));
        System.out.println("hungrySingletonA.equals(hungrySingletonB) : " + String.valueOf(hungrySingletonA.equals(hungrySingletonB)));

        LazySingleton lazySingletonA = LazySingleton.getInstance();
        LazySingleton lazySingletonB = LazySingleton.getInstance();
        System.out.println(lazySingletonA);
        System.out.println(lazySingletonB);
        System.out.println("lazySingletonA == lazySingletonB : " + String.valueOf(lazySingletonA == lazySingletonB));
        System.out.println("lazySingletonA.equals(lazySingletonB) : " + String.valueOf(lazySingletonA.equals(lazySingletonB)));

        List<Multiton> list = new ArrayList<Multiton>();
        for ( int i=0; i<5; i++){
            list.add(Multiton.getInstance());
        }
        for ( int i=0; i<5; i++){
            System.out.println("list "+ i + " : " + list.get(i));
        }
        System.out.println("==================== 创建型模式 1 : 单例模式（Singleton） Sample END =====================\n");

    }
}
