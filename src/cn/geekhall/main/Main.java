/**
 * @Project : GoF
 * @Package : cn.geekhall.main
 * @File : Main.java
 * @Descriptioni : TODO
 * @Author : yiny
 * @Date : 2021/4/20 21:46
 */
package cn.geekhall.main;

import cn.geekhall.basic.reflaction.ReflactionSample;
import cn.geekhall.gof.structure.adapter.AdapterSample;
import cn.geekhall.gof.structure.bridge.BridgeSample;

import java.lang.reflect.InvocationTargetException;

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
//        /**
//         * Java 基础
//         */
//        basicSample();

//        /**
//         * Principle 1 :开闭原则(OCP)
//         */
//        OCPSample.execute();
//
//        /**
//         * Principle 2 : 里氏替换原则(LSP)
//         */
//        LSPSample.execute();
//
//        /**
//         * Principle 3 : 依赖倒置原则（DIP）
//         */
//        DIPSample.execute();
//
//        /**
//         * Principle 4 : 单一职责原则（SRP)
//         */
//        SRPSample.execute();
//
//        /**
//         * Principle 5 : 接口隔离原则 (ISP)
//         */
//        ISPSample.execute();
//
//        /**
//         * Principle 6 : 迪米特法则（LKP）
//         */
//        LKPSample.execute();
//
//
//        /**
//         * Principle 7 : 合成复用原则（SRP）
//         */
//        CRPSample.execute();
//
//        /**
//         * 创建型模式 1 : 单例模式（Singleton）
//         */
//        SingletonSample.execute();
//
//        /**
//         * 创建型模式 2 : 原型模式（Prototype）
//         */
////        PrototypeSample.execute();
//
//        /**
//         * 创建型模式 3 ： 简单工厂模式（SimpleFactory）
//         */
//        SimpleFactorySample.execute();
//
//        /**
//         * 创建型模式 3 ： 工厂方法模式（FactoryMethod）
//         */
//        FactoryMethodSample.execute();
//
//        /**
//         * 创建型模式 3 ： 抽象工厂模式（AbstractFactory）
//         */
//        AbstractFactorySample.execute();
//
//        /**
//         * 创建型模式 4 ： 创建者模式（Builder）
//         */
//        BuilderSample.execute();
//
//        /**
//         * 结构型模式 1 ： 代理模式（Proxy）
//         */
//        ProxySample.execute();
//
//        /**
//         * 结构型模式 2 ： 适配器模式（Adapter）
//         */
//        AdapterSample.execute();

        /**
         * 结构型模式 3 ： 桥接模式（Bridge）
         */
        BridgeSample.execute();

    }

}
