/**
 * @Project : GoF
 * @Package : cn.geekhall.arch.spi
 * @File : Dog.java
 * @Descriptioni : TODO
 * @Author : yiny
 * @Date : 2021/4/28 22:05
 */
package cn.geekhall.arch.spi;

public class Dog implements IShout {
    @Override
    public void shout() {
        System.out.println("汪汪");
    }
}
