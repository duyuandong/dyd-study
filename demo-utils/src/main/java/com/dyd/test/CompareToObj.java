package com.dyd.test;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.CompareToObj
 * @date ：Created in 2021/7/20 15:41
 * @description：
 * @modified By：
 * @version:
 */
public class CompareToObj {
    public static void main(String[] args) {
       /* ArrayList<Object> list = new ArrayList<>();
        list.add(7);
        list.add(1);
        list.add(4);
        list.add(10);
        list.add(0);

        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                System.out.println(i+"&&"+j);
            }
        }*/
        /*HashMap<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("sour",null);
        String a = StringUtils.isEmpty((String)objectObjectHashMap.get("sour"))?"0":objectObjectHashMap.get("sour").toString();
        System.out.println(a);*/

        /*final DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(Double.parseDouble("0.9")));*/
        /*SpelExpressionParser parser = new SpelExpressionParser();
        StandardEvaluationContext context = new StandardEvaluationContext();
        try {
            context.registerFunction("replace", StringUtils.class.getDeclaredMethod("replace",new Class[]{String.class}));
            System.out.println(parser.parseExpression("#replace('hello','e','i')").getValue(context,String.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }*/
        HashMap<Object, Object> map = new HashMap<>();
        map.put("amount",1);

        String a = String.valueOf(map.get("amount"));
        System.out.println(a);

        Integer b= 0;
        System.out.println(b.compareTo(0));
        System.out.println(b.compareTo(-1));
        System.out.println(b.compareTo(1));

        System.out.println(System.currentTimeMillis()+"");

        System.out.println(b> 1);
        System.out.println("-----------------------------------------------------");
        BigDecimal bigDecimal = new BigDecimal(15.0498000);//ROUND_HALF_UP 四舍五入 ROUND_DOWN 去尾法 ROUND_UP 进一法
        String monthlyFeeStr = BigDecimal.valueOf(bigDecimal.intValue()).divide(new BigDecimal("100.00")).setScale(2).toString();
        System.out.println(monthlyFeeStr);
        //System.out.println(Integer.valueOf(null));
        System.out.println("-----------------------------------------------------");

        System.out.println(Double.parseDouble("147.20") * 100);
        System.out.println("-----------------------------------------------------");
        Double sDub = new BigDecimal("147.90").multiply(BigDecimal.valueOf(100)).doubleValue();
        System.out.println(sDub);

        System.out.println(bigDecimal.setScale(4,BigDecimal.ROUND_UP).toPlainString());

        ArrayList<String> list = Lists.newArrayList();
        System.out.println(list.isEmpty());

        List aList = null;
        System.out.println(CollectionUtils.isEmpty(aList));

        Long avc = null;
        String s = String.valueOf(avc);
        System.out.println(StringUtils.isBlank(s));


    }
}
