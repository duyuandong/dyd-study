package com.dyd.design.heima.xingweixing.interpreter;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.interpreter.xingweixing.heima.design.Variable
 * @date ：Created in 2024/1/25 13:58
 * @description：非终结符表达式角色
 * @modified By：
 * @version:
 */
public class Variable extends AbstractExpression{
    //声明存储变量名的成员变量
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    int interprete(Context context) {
        return context.getValue(this);
    }


}
