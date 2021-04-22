/**
 * @Project : GoF
 * @Package : cn.geekhall.gof.creation.prototype
 * @File : Realizetype.java
 * @Descriptioni : TODO
 * @Author : yiny
 * @Date : 2021/4/22 22:18
 */
package cn.geekhall.gof.creation.prototype;

public class Realizetype implements Cloneable{
    Realizetype(){
        System.out.println("具体原型创建成功！");
    }

    public Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype)super.clone();
    }
}
