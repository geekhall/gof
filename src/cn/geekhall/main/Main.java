/**
 * @Project : GoF
 * @Package : cn.geekhall.main
 * @File : Main.java
 * @Descriptioni : TODO
 * @Author : yiny
 * @Date : 2021/4/20 21:46
 */
package cn.geekhall.main;

import cn.geekhall.gof.creation.factory.abstractfactory.AbstractFactorySample;
import cn.geekhall.gof.creation.factory.factorymethod.AbstractFactory;
import cn.geekhall.gof.creation.factory.factorymethod.FactoryMethodSample;
import cn.geekhall.gof.creation.factory.simplefactory.SimpleFactory;
import cn.geekhall.gof.creation.factory.simplefactory.SimpleFactorySample;
import cn.geekhall.gof.creation.prototype.PrototypeSample;
import cn.geekhall.gof.creation.singleton.SingletonSample;
import cn.geekhall.gof.principle.principle1.OCPSample;
import cn.geekhall.gof.principle.principle2.LSPSample;
import cn.geekhall.gof.principle.principle3.DIPSample;
import cn.geekhall.gof.principle.principle4.SRPSample;
import cn.geekhall.gof.principle.principle5.ISPSample;
import cn.geekhall.gof.principle.principle6.LKPSample;
import cn.geekhall.gof.principle.principle7.CRPSample;

public class Main {




    public static void main(String[] args){
        /**
         * Principle 1 :开闭原则(OCP)
         */
        OCPSample.execute();

        /**
         * Principle 2 : 里氏替换原则(LSP)
         */
        LSPSample.execute();

        /**
         * Principle 3 : 依赖倒置原则（DIP）
         */
        DIPSample.execute();

        /**
         * Principle 4 : 单一职责原则（SRP)
         */
        SRPSample.execute();

        /**
         * Principle 5 : 接口隔离原则 (ISP)
         */
        ISPSample.execute();

        /**
         * Principle 6 : 迪米特法则（LKP）
         */
        LKPSample.execute();


        /**
         * Principle 7 : 合成复用原则（SRP）
         */
        CRPSample.execute();

        /**
         * 创建型模式 1 : 单例模式（Singleton）
         */
        SingletonSample.execute();

        /**
         * 创建型模式 2 : 原型模式（Prototype）
         */
//        PrototypeSample.execute();

        /**
         * 创建型模式 3 ： 简单工厂模式（SimpleFactory）
         */
        SimpleFactorySample.execute();

        /**
         * 创建型模式 3 ： 工厂方法模式（FactoryMethod）
         */
        FactoryMethodSample.execute();

        /**
         * 创建型模式 3 ： 抽象工厂模式（AbstractFactory）
         */
        AbstractFactorySample.execute();

    }

}
