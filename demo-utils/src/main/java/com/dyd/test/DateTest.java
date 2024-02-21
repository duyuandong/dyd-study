package com.dyd.test;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.DateTest
 * @date ：Created in 2021/5/20 10:19
 * @description：
 * @modified By：
 * @version:
 */
public class DateTest {

  public static void main(String[] args) {
    /*  String timestamp = getTimestamp(new Date());
    System.out.println(timestamp);*/
    // 判断一个时间是否在区间内
    /*String format = "HH:mm:ss";
    try {
        Date nowTime = new SimpleDateFormat(format).parse("09:26:00");
        Date startTime = new SimpleDateFormat(format).parse("09:27:00");
        Date endTime = new SimpleDateFormat(format).parse("09:27:59");
        System.out.println(isEffectiveDate(nowTime, startTime, endTime));
    }catch (Exception e){
        e.printStackTrace();
    }*/

    /*   String a = "a,b,c";
    List<String> strings = Arrays.asList(a);
    for (String string : strings) {
        string = "bbbb"+string;
    }
    System.out.println(strings.toString());*/

    /* SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd");
    String time = "2021/10/31 0:00:00";
    try {
        Date parse = sf.parse(time);
        String format = sf2.format(parse);
        System.out.println(format);
    } catch (ParseException e) {
        e.printStackTrace();
    }*/
    /*Map<Integer, List<String>> map = new HashMap<>();
    ArrayList<String> list = new ArrayList<>();
    list.add("123");
    list.add("456");
    map.put(123, list);
    System.out.println(map);
    List<String> strings = map.get(123);
    strings.add("456");
    System.out.println(map);

    Integer communityId;

    communityId = Integer.parseInt("212_33".split("_")[1]);
    String str = "平方米（m²）";
    System.out.println(str.substring(str.indexOf("（")));

    System.out.println(StringUtils.isNumeric("100092"));*/

    String TimePg = "09:00-18:00";
    String match = "[0-2][0-9]:[0-9]{2}-[0-2][0-9]:[0-9]{2}";
    Pattern compile = Pattern.compile(match);
    if(compile.matcher(TimePg).matches()){
      System.out.println(true);
    }else{
      System.out.println(false);
    }
  }

  public static String getTimestamp(String date) {
    BigInteger[] resBigIntegers = null;
    try {
      SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      Date parse = sf.parse(date);
      String dt = String.valueOf(parse.getTime());
      BigInteger bigInteger = new BigInteger(dt);
      BigInteger bigInteger2 = new BigInteger("1000");
      resBigIntegers = bigInteger.divideAndRemainder(bigInteger2);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return String.valueOf(resBigIntegers[0]);
  }

  public static String getTimestamp(Date date) {
    BigInteger[] resBigIntegers = null;
    try {
      String dt = String.valueOf(date.getTime());
      BigInteger bigInteger = new BigInteger(dt);
      BigInteger bigInteger2 = new BigInteger("1000");
      resBigIntegers = bigInteger.divideAndRemainder(bigInteger2);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return String.valueOf(resBigIntegers[0]);
  }

  /**
   * 判断当前时间是否在[startTime, endTime]区间，注意时间格式要一致
   *
   * @param nowTime 当前时间
   * @param startTime 开始时间
   * @param endTime 结束时间
   * @return
   * @author jqlin
   */
  public static boolean isEffectiveDate(Date nowTime, Date startTime, Date endTime) {
    if (nowTime.getTime() == startTime.getTime() || nowTime.getTime() == endTime.getTime()) {
      return true;
    }

    Calendar date = Calendar.getInstance();
    date.setTime(nowTime);

    Calendar begin = Calendar.getInstance();
    begin.setTime(startTime);

    Calendar end = Calendar.getInstance();
    end.setTime(endTime);

    if (date.after(begin) && date.before(end)) {
      return true;
    } else {
      return false;
    }
  }
}
