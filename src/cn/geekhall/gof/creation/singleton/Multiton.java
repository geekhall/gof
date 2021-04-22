package cn.geekhall.gof.creation.singleton;

import com.sun.org.apache.xpath.internal.operations.Mult;

import java.util.*;

/**
 * @author yiny
 * @Type Multiton.java
 * @Desc 多例模式
 * @date 4/22/21 7:56 PM
 */
public class Multiton {

    // 控制实例池的最大数量
    private static final Integer MAX_INSTANCE_NUM = 10;

    // 创建一个单例的池子
    private static Map<Integer, Multiton> instancePool = new HashMap<Integer, Multiton>();


    private static int num = 0;

    private static final Random random = new Random();

    private Multiton(){

    }

    /**
     * 饿汉式，静态代码块，随着类的加载而执行，只执行一次。
     */
//    static {
//        for ( int i=0; i<MAX_INSTANCE_NUM; i++ ){
//            instancePool.put(i, new Multiton());
//        }
//    }

    /**
     * 获取实例方法，如果存在则返回，否则创建一个新的实例加入池子中并返回。
     * @return
     */
    public synchronized static Multiton getInstance(){
        Multiton instance = instancePool.get(num);
        if (instance == null){
            instance = new Multiton();
            instancePool.put(num, instance);
        }
        num = (num + 1)% MAX_INSTANCE_NUM;
        return instance;
    }
}
