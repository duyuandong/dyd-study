package com.dyd.test;

import com.alibaba.fastjson.JSONObject;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.Date;
import java.util.HashMap;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.SpElTest
 * @date ：Created in 2022/2/15 9:57
 * @description：
 * @modified By：
 * @version:
 */
public class SpElTest {
  public static ExpressionParser parser = new SpelExpressionParser();

  public static void main(String[] args) {
    // 字面量表达式： SpEL支持的字面量包括：字符串、数字类型（int、long、float、double）、布尔类型、null类型。
    int int1 = parser.parseExpression("1").getValue(Integer.class);
    long long1 = parser.parseExpression("-1L").getValue(long.class);
    float float1 = parser.parseExpression("1.1").getValue(Float.class);
    double double1 = parser.parseExpression("1.1E+2").getValue(double.class);
    int hex1 = parser.parseExpression("0xa").getValue(Integer.class);
    long hex2 = parser.parseExpression("0xaL").getValue(long.class);
    boolean true1 = parser.parseExpression("true").getValue(boolean.class);
    boolean false1 = parser.parseExpression("false").getValue(boolean.class);
    Object null1 = parser.parseExpression("null").getValue(Object.class);
    System.out.println(null1);
    // 算数运算表达式： SpEL支持加(+)、减(-)、乘(*)、除(/)、求余（%）、幂（^）运算。
    Integer result7 = parser.parseExpression("4%3").getValue(Integer.class);
    System.out.println(result7);
    // 等于（==）、不等于(!=)、大于(>)、大于等于(>=)、小于(<)、小于等于(<=)，区间（between）运算，如
    Boolean result5 = parser.parseExpression("1 between {1, 2}").getValue(Boolean.class);
    System.out.println(result5);
    Boolean result6 = parser.parseExpression("1 EQ 1").getValue(Boolean.class);
    System.out.println(result6);
    // 逻辑表达式：且（and）、或(or)、非(!或NOT)。
    Boolean result4 = parser.parseExpression("2>1 and (!true or !false)").getValue(Boolean.class);
    System.out.println(result4);
    // 字符串连接及截取表达式
    String value1 = parser.parseExpression("'Hello World!'[0]").getValue(String.class);
    System.out.println(value1);
    System.out.println("231321421412412");
    // 三目运算及Elivis运算表达式
    Boolean result2 = parser.parseExpression("2>1?true:false").getValue(Boolean.class);
    Boolean result3 = parser.parseExpression("null?:false").getValue(Boolean.class); // true?:false
    System.out.println(result2);
    System.out.println(result3);
    // 括号优先级表达式
    // 正则表达式
    Boolean regResult = parser.parseExpression("'123' matches '\\d{3}'").getValue(Boolean.class);
    System.out.println(regResult);
    // 类类型
    Class<String> result1 = parser.parseExpression("T(String)").getValue(Class.class);
    System.out.println(result1);
    // 类实例化
    String value = parser.parseExpression("new String('haha')").getValue(String.class);
    System.out.println(value);
    // Date
    Date value3 = parser.parseExpression("new java.util.Date()").getValue(Date.class);
    System.out.println(value3);
    // 支持instanceof 表达式
    Boolean value2 = parser.parseExpression("'haha' instanceof T(String)").getValue(Boolean.class);
    System.out.println(value2);

    System.out.println("---------------自定义函数------------------");
    // 自定义函数 SpE还允许引用根对象及当前上下文对象，使用“#root”引用根对象，使用“#this”引用当前上下文对象；
    testVariableExpression();
  }

  public static void testVariableExpression() {
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("systemId", 12345);
    HashMap<Integer, Object> map = new HashMap<>();
    map.put(12345, "242145325324423");
    EvaluationContext context = new StandardEvaluationContext();
    context.setVariable("variable", "haha");
    context.setVariable("TokenUtil", map);
    context.setVariable("config", jsonObject);
    String contextResult1 =
        parser
            .parseExpression("'Bearer'.concat(' ').concat(#TokenUtil.get(#config.get('systemId')))")
            .getValue(context, String.class);
    System.out.println(contextResult1);
    /*context = new StandardEvaluationContext("haha");
    String contextResult2 = parser.parseExpression("#root").getValue(context, String.class);
    System.out.println(contextResult2);
    String contextResult3 = parser.parseExpression("#this").getValue(context, String.class);
    System.out.println(contextResult3);*/
  }
}
