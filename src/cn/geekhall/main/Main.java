/**
 * @Project : GoF
 * @Package : cn.geekhall.main
 * @File : Main.java
 * @Descriptioni : TODO
 * @Author : yiny
 * @Date : 2021/4/20 21:46
 */
package cn.geekhall.main;

import cn.geekhall.gof.principle.principle1.OCPSample;
import cn.geekhall.gof.principle.principle2.LSPSample;
import cn.geekhall.gof.principle.principle3.DIPSample;
import cn.geekhall.gof.principle.principle4.SRPSample;

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
    }

}
