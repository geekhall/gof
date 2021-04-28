/**
 * @Project : GoF
 * @Package : cn.geekhall.arch.spi
 * @File : Cat.java
 * @Descriptioni : TODO
 * @Author : yiny
 * @Date : 2021/4/28 22:04
 */
package cn.geekhall.arch.spi;

public class Cat implements IShout {
    @Override
    public void shout() {
        System.out.println("喵喵~");
    }
}
