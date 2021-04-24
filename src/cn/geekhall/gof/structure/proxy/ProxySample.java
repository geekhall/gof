package cn.geekhall.gof.structure.proxy;

import cn.geekhall.gof.structure.proxy.staticproxy.Proxy;

/**
 * @author yiny
 * @Type ProxySample.java
 * @Desc
 * @date 4/24/21 12:17 PM
 */
public class ProxySample {
    public static void execute(){
        System.out.println("==================== 结构型模式 1 : 代理模式（Proxy） Sample START =====================");
        Proxy proxy = new Proxy();
        proxy.request();
        System.out.println("==================== 结构型模式 1 : 代理模式（Proxy） Sample END =====================\n");
    }
}
