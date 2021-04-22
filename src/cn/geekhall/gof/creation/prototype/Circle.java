/**
 * @Project : GoF
 * @Package : cn.geekhall.gof.creation.prototype
 * @File : Circle.java
 * @Descriptioni : TODO
 * @Author : yiny
 * @Date : 2021/4/22 23:03
 */
package cn.geekhall.gof.creation.prototype;

import java.util.Scanner;

public class Circle implements Shape {

    @Override
    public Object clone() {
        Circle circle = null;
        try {
            circle = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("拷贝圆失败");
        }
        return circle;
    }

    @Override
    public void countArea() {
        int r = 0;
        System.out.println("这是一个圆形，请输入圆的半径：");
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
        System.out.println("圆的面积=" + 3.1415 * r * r + "\n");
    }
}
