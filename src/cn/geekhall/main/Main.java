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



    }

}
