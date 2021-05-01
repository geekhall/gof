/**
 * @Project : GoF
 * @Package : cn.geekhall.main
 * @File : Main.java
 * @Descriptioni : TODO
 * @Author : yiny
 * @Date : 2021/4/20 21:46
 */
package cn.geekhall.main;

import cn.geekhall.basic.BasicSample;
import cn.geekhall.gof.behavior.chainofresponsibility.ChainOfResopnsibilitySample;
import cn.geekhall.gof.behavior.command.CommandSample;
import cn.geekhall.gof.behavior.interpreter.InterpreterSample;
import cn.geekhall.gof.behavior.iterator.IteratorSample;
import cn.geekhall.gof.behavior.mediator.MediatorSample;
import cn.geekhall.gof.behavior.memento.MementoSample;
import cn.geekhall.gof.behavior.observer.ObserverSample;
import cn.geekhall.gof.behavior.state.StateSample;
import cn.geekhall.gof.behavior.strategy.StrategySample;
import cn.geekhall.gof.behavior.templatemethod.TemplateMethodSample;
import cn.geekhall.gof.behavior.visitor.VisitorSample;
import cn.geekhall.gof.creation.builder.BuilderSample;
import cn.geekhall.gof.creation.factory.abstractfactory.AbstractFactorySample;
import cn.geekhall.gof.creation.factory.factorymethod.FactoryMethodSample;
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
import cn.geekhall.gof.structure.adapter.AdapterSample;
import cn.geekhall.gof.structure.bridge.BridgeSample;
import cn.geekhall.gof.structure.composite.ComponentSample;
import cn.geekhall.gof.structure.decorator.DecoratorSample;
import cn.geekhall.gof.structure.facade.FacadeSample;
import cn.geekhall.gof.structure.flyweight.FlyweightSample;
import cn.geekhall.gof.structure.proxy.ProxySample;



public class Main {

    public static void main(String[] args){
        // Java 基础
        BasicSample.execute();                  // Java 基础

        // 设计模式七大原则
        OCPSample.execute();                    // Principle 1 : 开闭原则 (OCP)
        LSPSample.execute();                    // Principle 2 : 里氏替换原则 (LSP)
        DIPSample.execute();                    // Principle 3 : 依赖倒置原则（DIP）
        SRPSample.execute();                    // Principle 4 : 单一职责原则（SRP)
        ISPSample.execute();                    // Principle 5 : 接口隔离原则 (ISP)
        LKPSample.execute();                    // Principle 6 : 迪米特法则（LKP）
        CRPSample.execute();                    // Principle 7 : 合成复用原则（SRP）

        // 创建型模式
        SingletonSample.execute();              // 创建型模式 1 :  单例模式（Singleton）
        PrototypeSample.execute();              // 创建型模式 2 :  原型模式（Prototype）
        SimpleFactorySample.execute();          // 创建型模式 3 ： 简单工厂模式（SimpleFactory）
        FactoryMethodSample.execute();          // 创建型模式 3 ： 工厂方法模式（FactoryMethod）
        AbstractFactorySample.execute();        // 创建型模式 3 ： 抽象工厂模式（AbstractFactory）
        BuilderSample.execute();                // 创建型模式 4 ： 创建者模式（Builder）

        // 结构型模式
        ProxySample.execute();                  // 结构型模式 1 ： 代理模式（Proxy）
        AdapterSample.execute();                // 结构型模式 2 ： 适配器模式（Adapter）
        BridgeSample.execute();                 // 结构型模式 3 ： 桥接模式（Bridge）
        DecoratorSample.execute();              // 结构型模式 4 ： 装饰器模式 （Decorator）
        FacadeSample.execute();                 // 结构型模式 5 ： 外观模式 （Facade）
        FlyweightSample.execute();              // 结构型模式 6 ： 享元模式（Flyweight)
        ComponentSample.execute();              // 结构型模式 7 ： 组合模式（Component)

        // 行为型模式
        TemplateMethodSample.execute();         // 行为型模式 1 ： 模版方法模式（TemplateMethod）
        StrategySample.execute();               // 行为型模式 2 ： 策略模式（Strategy）
        CommandSample.execute();                // 行为型模式 3 ： 命令模式（Command）
        ChainOfResopnsibilitySample.execute();  // 行为型模式 4 ： 责任链模式（Chain of responsibility）
        StateSample.execute();                  // 行为型模式 5 ： 状态模式（State）
        ObserverSample.execute();               // 行为型模式 6 ： 观察者模式（Observer）
        MediatorSample.execute();               // 行为型模式 7 ： 中介者模式（Mediator）
        IteratorSample.execute();               // 行为型模式 8 ： 迭代器模式（Iterator）
        VisitorSample.execute();                // 行为型模式 9 ： 访问者模式（Visitor）
        MementoSample.execute();                // 行为型模式 10 ： 备忘录模式（Memento）
        InterpreterSample.execute();            // 行为型模式 11 ： 解释器模式（Interpreter）
    }

}
