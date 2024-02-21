package com.dyd.test.beanut;

import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.beanut.Test
 * @date ：Created in 2022/5/11 18:51
 * @description：
 * @modified By：
 * @version:
 */
public class Test extends BeanUtils {

  /**
   * 实现List 集合对象的拷贝处理
   *
   * @param sources 原始对象集合
   * @param target 目标对象集合
   * @param <S> 源对象类型
   * @param <T> 目标对象类型
   * @return 拷贝后的List 集合
   */
  public static <S, T> List<T> copyListProperties(List<S> sources, Supplier<T> target) {
    List<T> res = new ArrayList<>(sources.size());
    for (S source : sources) {
      // 获取数据
      T obj = target.get();
      // 拷贝参数
      copyProperties(source, obj);
      res.add(obj);
    }
    return res;
  }

  public static void main(String[] args) {
    //
    /* MeterAttr meterAttr = new MeterAttr("嘿嘿", 0.23);
    BeanCopy bc1 = new BeanCopy("18", new MeterAttr("嘿嘿", 0.23));
    BeanCopy bc2 = new BeanCopy("22", new MeterAttr("宏宏", 0.73));
    ArrayList<BeanCopy> list = Lists.newArrayListWithCapacity(2);
    list.add(bc1);
    list.add(bc2);
    System.out.println(JSON.toJSONString(list));
    */
    /*MeterAttr meterAttr1 = new MeterAttr("xxxxx", 0.88);
    MeterAttr meterAttr2 = new MeterAttr("xxxxx", 0.88);
    ArrayList<MeterAttr> list2 = Lists.newArrayListWithCapacity(2);
    list2.add(meterAttr1);
    list2.add(meterAttr2);
    System.out.println(JSON.toJSONString(list2));*/
    /*
    List<MeterAttr> objects = Lists.newArrayList();
    for (int i = 0; i < 2; i++) {
      MeterAttr beanCopy = BeanCopierUtils.copyProperties(meterAttr, MeterAttr.class);
      beanCopy.setName(14 + i + "");
      objects.add(beanCopy);
    }*/
    /* System.out.println(JSON.toJSONString(objects));
    System.out.println("99======================================999");
    List<BeanCopy2> list1 = Lists.newArrayListWithCapacity(list.size());
    for (BeanCopy beanCopy : list) {
      BeanCopy2 beanCopy2 = BeanCopierUtils.copyProperties(beanCopy, BeanCopy2.class);
      MeterAttr2 meterAttr2 =
          BeanCopierUtils.copyProperties(beanCopy.getMeterAttr(), MeterAttr2.class);
      beanCopy2.setMeterAttr(meterAttr2);
      list1.add(beanCopy2);
    }
    // List<MeterAttr2> beanCopies = BeanCopierUtils.copyList2List(list2, MeterAttr2.class, true);
    System.out.println(JSON.toJSONString(list1));*/

    String arrayList =
        "[{\"payType\":\"79003\",\"carParkingId\":\"7rqn1scr\",\"money\":\"6.00\",\"finalMoney\":\"6.00\",\"orderId\":\"20220816093233355-D198RH\",\"carNo\":\"闽D198RH\",\"stayTime\":\"210\",\"isTempCar\":\"5901\",\"outTime\":\"2022-08-16 13:02:54\",\"payDate\":\"2022-08-16 13:02:54\"},{\"payType\":\"79003\",\"carParkingId\":\"7rqn1scr\",\"money\":\"6.00\",\"finalMoney\":\"6.00\",\"orderId\":\"20220816101029784-D379GM\",\"carNo\":\"闽D379GM\",\"stayTime\":\"199\",\"isTempCar\":\"5901\",\"outTime\":\"2022-08-16 13:30:02\",\"payDate\":\"2022-08-16 13:30:02\"},{\"payType\":\"79003\",\"carParkingId\":\"7rqn1scr\",\"money\":\"17.00\",\"finalMoney\":\"17.00\",\"orderId\":\"20220815234034506-DB5Z67\",\"carNo\":\"闽DB5Z67\",\"stayTime\":\"858\",\"isTempCar\":\"5901\",\"outTime\":\"2022-08-16 13:59:05\",\"payDate\":\"2022-08-16 13:59:05\"},{\"payType\":\"79003\",\"carParkingId\":\"7rqn1scr\",\"money\":\"5.00\",\"finalMoney\":\"5.00\",\"orderId\":\"20220816133755808-DB83P8\",\"carNo\":\"闽DB83P8\",\"stayTime\":\"44\",\"isTempCar\":\"5901\",\"outTime\":\"2022-08-16 14:22:08\",\"payDate\":\"2022-08-16 14:22:08\"},{\"payType\":\"79003\",\"carParkingId\":\"7rqn1scr\",\"money\":\"5.00\",\"finalMoney\":\"5.00\",\"orderId\":\"20220816130422376-D3162E\",\"carNo\":\"闽D3162E\",\"stayTime\":\"118\",\"isTempCar\":\"5901\",\"outTime\":\"2022-08-16 15:02:41\",\"payDate\":\"2022-08-16 15:02:41\"},{\"payType\":\"79003\",\"carParkingId\":\"7rqn1scr\",\"money\":\"5.00\",\"finalMoney\":\"5.00\",\"orderId\":\"20220816140855248-D093MB\",\"carNo\":\"闽D093MB\",\"stayTime\":\"59\",\"isTempCar\":\"5901\",\"outTime\":\"2022-08-16 15:08:21\",\"payDate\":\"2022-08-16 15:08:21\"},{\"payType\":\"79003\",\"carParkingId\":\"7rqn1scr\",\"money\":\"5.00\",\"finalMoney\":\"5.00\",\"orderId\":\"20220816123119212-DZ3Z16\",\"carNo\":\"闽DZ3Z16\",\"stayTime\":\"175\",\"isTempCar\":\"5901\",\"outTime\":\"2022-08-16 15:26:55\",\"payDate\":\"2022-08-16 15:26:55\"},{\"payType\":\"79003\",\"carParkingId\":\"7rqn1scr\",\"money\":\"5.00\",\"finalMoney\":\"5.00\",\"orderId\":\"20220816150857112-D1PH15\",\"carNo\":\"闽D1PH15\",\"stayTime\":\"64\",\"isTempCar\":\"5901\",\"outTime\":\"2022-08-16 16:13:35\",\"payDate\":\"2022-08-16 16:13:35\"},{\"payType\":\"79003\",\"carParkingId\":\"7rqn1scr\",\"money\":\"5.00\",\"finalMoney\":\"5.00\",\"orderId\":\"20220816141612966-D198RH\",\"carNo\":\"闽D198RH\",\"stayTime\":\"117\",\"isTempCar\":\"5901\",\"outTime\":\"2022-08-16 16:14:06\",\"payDate\":\"2022-08-16 16:14:06\"},{\"payType\":\"79003\",\"carParkingId\":\"7rqn1scr\",\"money\":\"6.00\",\"finalMoney\":\"6.00\",\"orderId\":\"20220816123638088-DX6W77\",\"carNo\":\"闽DX6W77\",\"stayTime\":\"239\",\"isTempCar\":\"5901\",\"outTime\":\"2022-08-16 16:36:04\",\"payDate\":\"2022-08-16 16:36:04\"},{\"payType\":\"79003\",\"carParkingId\":\"7rqn1scr\",\"money\":\"5.00\",\"finalMoney\":\"5.00\",\"orderId\":\"20220816150653140-D3162E\",\"carNo\":\"闽D3162E\",\"stayTime\":\"99\",\"isTempCar\":\"5901\",\"outTime\":\"2022-08-16 16:46:25\",\"payDate\":\"2022-08-16 16:46:25\"},{\"payType\":\"79003\",\"carParkingId\":\"7rqn1scr\",\"money\":\"7.00\",\"finalMoney\":\"7.00\",\"orderId\":\"20220816123349293-D7RK29\",\"carNo\":\"闽D7RK29\",\"stayTime\":\"259\",\"isTempCar\":\"5901\",\"outTime\":\"2022-08-16 16:53:29\",\"payDate\":\"2022-08-16 16:53:29\"},{\"payType\":\"79003\",\"carParkingId\":\"7rqn1scr\",\"money\":\"5.00\",\"finalMoney\":\"5.00\",\"orderId\":\"20220816163537580-DD8020\",\"carNo\":\"闽DD80201\",\"stayTime\":\"32\",\"isTempCar\":\"5901\",\"outTime\":\"2022-08-16 17:08:18\",\"payDate\":\"2022-08-16 17:08:18\"},{\"payType\":\"79003\",\"carParkingId\":\"7rqn1scr\",\"money\":\"14.00\",\"finalMoney\":\"14.00\",\"orderId\":\"20220816064818976-D869MZ\",\"carNo\":\"闽D869MZ\",\"stayTime\":\"661\",\"isTempCar\":\"5901\",\"outTime\":\"2022-08-16 17:49:25\",\"payDate\":\"2022-08-16 17:49:25\"},{\"payType\":\"79003\",\"carParkingId\":\"7rqn1scr\",\"money\":\"5.00\",\"finalMoney\":\"0.00\",\"orderId\":\"20220816171755993-D6Q026\",\"carNo\":\"闽D6Q026\",\"stayTime\":\"39\",\"isTempCar\":\"5901\",\"outTime\":\"2022-08-16 17:57:40\",\"payDate\":\"2022-08-16 17:57:40\"},{\"payType\":\"79003\",\"carParkingId\":\"7rqn1scr\",\"money\":\"6.00\",\"finalMoney\":\"6.00\",\"orderId\":\"20220816150358234-KB9895\",\"carNo\":\"云KB9895\",\"stayTime\":\"181\",\"isTempCar\":\"5901\",\"outTime\":\"2022-08-16 18:05:32\",\"payDate\":\"2022-08-16 18:05:32\"},{\"payType\":\"79003\",\"carParkingId\":\"7rqn1scr\",\"money\":\"7.00\",\"finalMoney\":\"7.00\",\"orderId\":\"20220816133115206-D589FK\",\"carNo\":\"闽D589FK\",\"stayTime\":\"288\",\"isTempCar\":\"5901\",\"outTime\":\"2022-08-16 18:20:02\",\"payDate\":\"2022-08-16 18:20:02\"},{\"payType\":\"79001\",\"carParkingId\":\"7rqn1scr\",\"money\":\"5.00\",\"finalMoney\":\"0.00\",\"orderId\":\"20220816171047216-D2982K\",\"carNo\":\"闽D2982K\",\"stayTime\":\"100\",\"isTempCar\":\"5901\",\"outTime\":\"2022-08-16 18:51:07\",\"payDate\":\"2022-08-16 18:51:07\"},{\"payType\":\"79003\",\"carParkingId\":\"7rqn1scr\",\"money\":\"5.00\",\"finalMoney\":\"5.00\",\"orderId\":\"20220816182351753-D6550M\",\"carNo\":\"闽D6550M\",\"stayTime\":\"150\",\"isTempCar\":\"5901\",\"outTime\":\"2022-08-16 20:54:22\",\"payDate\":\"2022-08-16 20:54:22\"},{\"payType\":\"79003\",\"carParkingId\":\"7rqn1scr\",\"money\":\"5.00\",\"finalMoney\":\"5.00\",\"orderId\":\"20220816193007820-DK627J\",\"carNo\":\"闽DK627J\",\"stayTime\":\"120\",\"isTempCar\":\"5901\",\"outTime\":\"2022-08-16 21:30:14\",\"payDate\":\"2022-08-16 21:30:14\"}]";
    JSONArray jsonArray = JSONArray.parseArray(arrayList);
    List<PushTempRecordDto> pushTempRecordDtos = jsonArray.toJavaList(PushTempRecordDto.class);
    System.out.println(pushTempRecordDtos);
  }
}
