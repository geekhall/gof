/**
 * @Project : GoF
 * @Package : cn.geekhall.gof.principle.principle3
 * @File : JingDong.java
 * @Descriptioni : TODO
 * @Author : yiny
 * @Date : 2021/4/20 23:00
 */
package cn.geekhall.gof.principle.principle3;

public class JingDong implements Shop {
    @Override
    public String sell() {
        return "京东：618打折";
    }
}
