package com.dyd.design.heima.xingweixing.interpreter;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.interpreter.xingweixing.heima.design.Plus
 * @date ：Created in 2024/1/25 14:01
 * @description：终结符表达式角色 (加法)
 * @modified By：
 * @version:
 */
public class Plus extends AbstractExpression{

    //左边表达式
    private AbstractExpression left;

    private AbstractExpression right;

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }

    @Override
    int interprete(Context context) {
        //将左边表达式的结果 与 右边的相加
        return left.interprete(context) + right.interprete(context);
    }
}
