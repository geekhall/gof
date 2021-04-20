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

public class Main {




    public static void main(String[] args){
        /*
         * principle 1 :开闭原则(OCP)
         */
        OCPSample.execute();

        /*
         * principle 2 : 里氏替换原则(LSP)
         */
        LSPSample.execute();
    }

}
