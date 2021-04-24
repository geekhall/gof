package cn.geekhall.gof.structure.adapter;

import cn.geekhall.gof.structure.adapter.sample1.ElectricAdapter;
import cn.geekhall.gof.structure.adapter.sample1.Motor;
import cn.geekhall.gof.structure.adapter.sample1.OpticalAdapter;
import cn.geekhall.gof.structure.adapter.sample2.Adapter;
import cn.geekhall.gof.structure.adapter.sample2.Adapter2;
import cn.geekhall.gof.structure.adapter.sample2.Computer;
import cn.geekhall.gof.structure.adapter.twoway.*;

/**
 * @author yiny
 * @Type AdapterSample.java
 * @Desc
 * @date 4/24/21 6:33 PM
 */
public class AdapterSample {
    public static void execute() {
        System.out.println("==================== 结构型模式 2 : 适配器模式（Adapter） Sample START =====================");
        System.out.println("-------- Sample 0 ： 基本适配器示例 Start --------");
        /**
         * 类适配器模式
         */
        Target target = new ClassAdapter();
        target.request();

        /**
         * 对象适配器模式
         */
        Adaptee adaptee = new Adaptee();
        Target target1 = new ObjectAdapter(adaptee);
        target1.request();
        System.out.println("-------- Sample 0 ： 基本适配器示例 End --------");
        System.out.println();

        System.out.println("-------- Sample 1 ： 汽车适配器示例 Start --------");
        /**
         * Sample 1 : 汽车适配器
         */

        Motor tesla = new ElectricAdapter();
        tesla.drive();

        Motor future = new OpticalAdapter();
        future.drive();

        System.out.println("-------- Sample 1 ： 汽车适配器示例 End --------");
        System.out.println();

        System.out.println("-------- Sample 2 ： 双向适配器示例 Start --------");
        System.out.println("目标通过双向适配器访问适配者：");
        TwoWayAdaptee twoWayAdaptee = new AdapteeRealize();
        TwoWayTarget twoWayTarget = new TwoWayAdapter(twoWayAdaptee);
        twoWayTarget.request();
        System.out.println("---------");
        System.out.println("适配者通过双向适配器访问目标：");
        twoWayTarget = new TargetRealize();
        twoWayAdaptee = new TwoWayAdapter(twoWayTarget);
        twoWayAdaptee.specificRequest();

        System.out.println("-------- Sample 2 ： 双向适配器示例 End --------");
        System.out.println();

        System.out.println("-------- Sample 3 ： 电脑转接头示例 Start --------");
        /**
         * 类适配器，使用继承实现
         */
        Computer computer = new Computer();     // 电脑
        Adaptee adaptee1 = new Adaptee();       // 网线
        Adapter adapter = new Adapter();        // 转接头
        computer.net(adapter);

        /**
         * 对象适配器，使用组合实现
         */
        Computer computer2 = new Computer();
        cn.geekhall.gof.structure.adapter.sample2.Adaptee adaptee2 = new cn.geekhall.gof.structure.adapter.sample2.Adaptee();
        Adapter2 adapter2 = new Adapter2(adaptee2);
        computer2.net(adapter2);


        System.out.println("-------- Sample 3 ： 电脑转接头示例 End --------");
        System.out.println();

        System.out.println("==================== 结构型模式 2 : 适配器模式（Adapter） Sample START =====================");
        System.out.println();

    }
}
