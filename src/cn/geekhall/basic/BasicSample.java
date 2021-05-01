package cn.geekhall.basic;

import cn.geekhall.arch.spi.IShout;
import cn.geekhall.basic.reflaction.ReflactionSample;

import java.util.ServiceLoader;

/**
 * @author yiny
 * @Type BasicSample.java
 * @Desc
 * @date 5/1/21 9:31 PM
 */
public class BasicSample {
    public static void execute(){
        System.out.println("==================== Java 基础 :  Sample START =====================");
        // 反射（Reflaction）
        try {
            ReflactionSample.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // SPI
        ServiceLoader<IShout> shorts = ServiceLoader.load(IShout.class);
        for (IShout s : shorts){
            System.out.println("aaa");
            s.shout();
        }
        System.out.println("==================== Java 基础 :  Sample END   =====================");
    }
}
