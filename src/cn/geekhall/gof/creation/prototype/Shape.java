/**
 * @Project : GoF
 * @Package : cn.geekhall.gof.creation.prototype
 * @File : Shape.java
 * @Descriptioni : TODO
 * @Author : yiny
 * @Date : 2021/4/22 23:02
 */
package cn.geekhall.gof.creation.prototype;

public interface Shape extends Cloneable {
    public Object clone();

    /**
     * 计算面积
     */
    public void countArea();
}
