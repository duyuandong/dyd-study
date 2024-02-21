package com.dyd.test;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.TryCatchTest
 * @date ：Created in 2021/12/24 15:53
 * @description：
 * @modified By：
 * @version:
 */
public class TryCatchTest {

  public static void main(String[] args) {
     System.out.println("=======输出======>" + TryCatchTest.getName("小明"));

   // System.out.println(StringUtils.isNumeric("123241241d"));
  }

  public static String getName(String name) {
    try {
      System.out.println("===============try开始===========");
      int a = 10 / 0;
      //Integer a = null;
      //a += 1;
      //throw new ParkingException("200","dsjaidsaiudhad点击三点");
    } catch (Exception e) {
      System.out.println("=============catch==============");
      System.out.println(e.getMessage());
      System.out.println("================================");
      System.out.println(e.getStackTrace()[0].getClassName() + " : " + e.getStackTrace()[0].getLineNumber());
      return name;
    } finally {
      System.out.println("=============finally==============");
      try {
        for (int i = 0; i < 3; i++) {
          Thread.sleep(5000);
          System.out.println("=============Thread.sleep==============");
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      return name;
    }
  }
}
