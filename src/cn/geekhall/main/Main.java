/**
 * @Project : GoF
 * @Package : cn.geekhall.main
 * @File : Main.java
 * @Descriptioni : TODO
 * @Author : yiny
 * @Date : 2021/4/20 21:46
 */
package cn.geekhall.main;

import cn.geekhall.arch.spi.IShout;
import cn.geekhall.basic.reflaction.ReflactionSample;
import cn.geekhall.gof.creation.builder.BuilderSample;
import cn.geekhall.gof.creation.factory.abstractfactory.AbstractFactorySample;
import cn.geekhall.gof.creation.factory.factorymethod.FactoryMethodSample;
import cn.geekhall.gof.creation.factory.simplefactory.SimpleFactorySample;
import cn.geekhall.gof.creation.singleton.SingletonSample;
import cn.geekhall.gof.principle.principle1.OCPSample;
import cn.geekhall.gof.principle.principle2.LSPSample;
import cn.geekhall.gof.principle.principle3.DIPSample;
import cn.geekhall.gof.principle.principle4.SRPSample;
import cn.geekhall.gof.principle.principle5.ISPSample;
import cn.geekhall.gof.principle.principle6.LKPSample;
import cn.geekhall.gof.principle.principle7.CRPSample;
import cn.geekhall.gof.structure.adapter.AdapterSample;
import cn.geekhall.gof.structure.bridge.BridgeSample;
import cn.geekhall.gof.structure.composite.ComponentSample;
import cn.geekhall.gof.structure.decorator.Component;
import cn.geekhall.gof.structure.decorator.DecoratorSample;
import cn.geekhall.gof.structure.facade.Facade;
import cn.geekhall.gof.structure.facade.FacadeSample;
import cn.geekhall.gof.structure.flyweight.Flyweight;
import cn.geekhall.gof.structure.flyweight.FlyweightSample;
import cn.geekhall.gof.structure.proxy.ProxySample;

import java.lang.reflect.InvocationTargetException;
import java.util.ServiceLoader;

public class Main {


    public static void basicSample(){

        /**
         * 反射（Reflaction）
         */
        try {
            ReflactionSample.execute();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        /**
         * Java 基础
         */
        basicSample();

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

        /**
         * 创建型模式 4 ： 创建者模式（Builder）
         */
        BuilderSample.execute();

        /**
         * 结构型模式 1 ： 代理模式（Proxy）
         */
        ProxySample.execute();

        /**
         * 结构型模式 2 ： 适配器模式（Adapter）
         */
        AdapterSample.execute();

        /**
         * 结构型模式 3 ： 桥接模式（Bridge）
         */
        BridgeSample.execute();

        ServiceLoader<IShout> shorts = ServiceLoader.load(IShout.class);
        for (IShout s : shorts){
            System.out.println("aaa");
            s.shout();
        }

        /**
         * 结构型模式 4 ： 装饰器模式 （Decorator）
         */
        DecoratorSample.execute();


        /**
         * 结构型模式 5 ： 外观模式 （Facade）
         */
        FacadeSample.execute();


        /**
         * 结构型模式 6 ： 享元模式（Flyweight)
         */
        FlyweightSample.execute();

        /**
         * 结构型模式 7 ： 组合模式（Component)
         */
        ComponentSample.execute();

    }

}
