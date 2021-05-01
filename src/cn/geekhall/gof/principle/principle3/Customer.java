/**
 * @Project : GoF
 * @Package : cn.geekhall.gof.principle.principle3
 * @File : Customer.java
 * @Descriptioni : TODO
 * @Author : yiny
 * @Date : 2021/4/20 22:57
 */
package cn.geekhall.gof.principle.principle3;

class Customer {
    void shopping(Shop shop){
        System.out.println(shop.sell());
    }
}
