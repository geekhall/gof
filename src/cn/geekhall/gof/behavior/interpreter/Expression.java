package cn.geekhall.gof.behavior.interpreter;

/**
 * @author yiny
 * @Type AbstractExpression.java
 * @Desc 抽象表达式类
 * @date 5/1/21 8:56 PM
 */
interface Expression {
    boolean interpret(String info);  // 解释方法
}
