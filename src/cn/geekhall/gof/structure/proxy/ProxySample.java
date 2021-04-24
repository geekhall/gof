package cn.geekhall.gof.structure.proxy;

import cn.geekhall.gof.structure.proxy.sample1.Landlord;
import cn.geekhall.gof.structure.proxy.sample2.UserService;
import cn.geekhall.gof.structure.proxy.sample2.UserServiceImpl;
import cn.geekhall.gof.structure.proxy.sample2.UserServiceProxy;
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

        System.out.println("------------- Sample 1 : 房东中介 start --------------- ");
        // 房东要租房子
        Landlord landlord = new Landlord();
        // 代理，中介帮房东租房子，
        cn.geekhall.gof.structure.proxy.sample1.Proxy proxy1 = new cn.geekhall.gof.structure.proxy.sample1.Proxy(landlord);

        // 并且做一些附属操作，看房子，签合同，收中介费等等。
        // 房客也不必面对房东，直接找中介。
        proxy1.rent();
        System.out.println("------------- Sample 1 : 房东中介 end --------------- ");

        System.out.println("------------- Sample 2 : 增删改查加日志例子（AOP） Start --------------- ");
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy proxy2 = new UserServiceProxy();
        proxy2.setUserService(userService);
        proxy2.add();
        proxy2.delete();
        proxy2.update();
        proxy2.query();

        System.out.println("------------- Sample 2 : 增删改查加日志例子（AOP） Start --------------- ");

        System.out.println("==================== 结构型模式 1 : 代理模式（Proxy） Sample END =======================");
        System.out.println();
    }
}
