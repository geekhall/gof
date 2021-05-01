package cn.geekhall.gof.behavior.interpreter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author yiny
 * @Type TerminalExpression.java
 * @Desc
 * @date 5/1/21 8:58 PM
 */
public class TerminalExpression implements Expression {
    private Set<String> set = new HashSet<String>();

    TerminalExpression(String[] data) {
        set.addAll(Arrays.asList(data));
    }

    @Override
    public boolean interpret(String info) {
        // 对终结符表达式的处理
        System.out.println("对终结符表达式的处理");
        return set.contains(info);
    }
}
