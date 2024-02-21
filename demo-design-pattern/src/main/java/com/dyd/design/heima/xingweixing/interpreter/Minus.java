package com.dyd.design.heima.xingweixing.interpreter;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.interpreter.xingweixing.heima.design.Plus
 * @date ：Created in 2024/1/25 14:01
 * @description：终结符表达式角色
 * @modified By：
 * @version:
 */
public class Minus extends AbstractExpression{

    private AbstractExpression left;

    private AbstractExpression right;

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }

    @Override
    int interprete(Context context) {
        return left.interprete(context) - right.interprete(context);
    }
}
