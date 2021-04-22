/**
 * @Project : GoF
 * @Package : cn.geekhall.gof.creation.prototype
 * @File : Square.java
 * @Descriptioni : TODO
 * @Author : yiny
 * @Date : 2021/4/22 23:07
 */
package cn.geekhall.gof.creation.prototype;

import java.util.Scanner;

public class Square implements Shape {
    @Override
    public Square clone() {
        Square square = null;
        try {
            square = (Square) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("拷贝正方形失败");
        }
        return square;
    }

    @Override
    public void countArea() {
        int a = 0;
        System.out.println("这是一个正方形，请输入他的边长：");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println("正方形的面积="+ a*a + "\n");
    }
}
