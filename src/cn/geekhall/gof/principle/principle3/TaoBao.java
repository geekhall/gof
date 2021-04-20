/**
 * @Project : GoF
 * @Package : cn.geekhall.gof.principle.principle3
 * @File : TaoBao.java
 * @Descriptioni : TODO
 * @Author : yiny
 * @Date : 2021/4/20 23:01
 */
package cn.geekhall.gof.principle.principle3;

public class TaoBao implements Shop {
    @Override
    public String sell() {
        return "淘宝：双十一打折";
    }
}
