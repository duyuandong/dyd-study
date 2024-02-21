package com.dyd.design.heima.xingweixing.interpreter;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.interpreter.xingweixing.heima.design.Client
 * @date ：Created in 2024/1/25 13:39
 * @description：解释器模式
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {
        //创建环境对象
        Context context = new Context();
        //创建多个变量对象
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");

        //存储
        context.assign(a,1);
        context.assign(b,2);
        context.assign(c,3);
        context.assign(d,4);

        //获取抽象语法树 a + b - c + d
        AbstractExpression expression = new Plus(new Minus(new Plus(a,b),c),d);

        //解释
        int interprete = expression.interprete(context);
        System.out.println(expression + "=" + interprete);
    }
}
