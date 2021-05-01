package cn.geekhall.gof.behavior.interpreter;


/**
 * @author yiny
 * @Type NonterminalExpression.java
 * @Desc 非终结符表达式
 * @date 5/1/21 9:00 PM
 */
public class AndExpression implements Expression {
    private Expression city = null;
    private Expression person = null;

    AndExpression(Expression city, Expression person){
        this.city = city;
        this.person = person;
    }
    @Override
    public boolean interpret(String info) {
        // 对非终结符表达式的处理
        System.out.println("对非终结符表达式的处理。");
        String s[] = info.split("的");
        return city.interpret(s[0]) && person.interpret(s[1]);
    }
}
