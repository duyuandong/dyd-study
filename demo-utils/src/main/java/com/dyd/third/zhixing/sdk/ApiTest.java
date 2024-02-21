package com.dyd.third.zhixing.sdk;/*
package com.spring.demo.third.zhixing.sdk;

public class ApiTest {
  private void print(Result result) {
    System.out.println(
        String.format(
            "code:%s,message:%s,data:%s", result.getCode(), result.getMessage(), result.getData()));
  }

  private void testUserLogin(String urlBase, String appId, String secretKey, long parkId) {
    try {
      String params =
          "{"
              + "\"userId\":120099233423,"
              + "\"userName\":\"测试用户\","
              + "\"role\":1,"
              + "\"state\":\"admin\""
              + "}";
      print(
          ApiRequest.postRequest(
              urlBase, "/user/login", appId, secretKey, parkId, true, true, params));
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  // 查询区域
  private void testQueryAreas(String urlBase, String appId, String secretKey, long parkId) {
    try {
      String params = "{\"mchId\":\"0\",\"msgid\":\"946ee6a83398bcf1b2f2e749bcae2d77\"}";
      print(
          ApiRequest.getRequest(
              urlBase, "/booking/queryAreas", appId, secretKey, parkId, false, false, params));
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  // 创建预约
  private void testCreateBooking(String urlBase, String appId, String secretKey, long parkId) {
    try {

      String params =
          "{\"mchId\":\"0\","
              + "\"areaId\":\"1162676772811601\","
              + "\"plateNumber\":\"鄂C56444\","
              + "\"startTime\":\"2022-05-10 08:00:00\","
              + "\"endTime\":\"2022-05-10 18:00:00\","
              + "\"name\":\"小包\","
              + "\"comment\":\"置信访客\""
              + "}";

      print(
          ApiRequest.postRequest(
              urlBase, "/booking/createBooking", appId, secretKey, parkId, false, false, params));
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  private void testInfo(String urlBase, String appId, String secretKey, long parkId) {
    try {
      print(
          ApiRequest.getRequest(
              urlBase, "/info/areas", appId, secretKey, parkId, true, true, null));
      print(
          ApiRequest.getRequest(
              urlBase, "/info/lanes", appId, secretKey, parkId, true, true, null));
      print(
          ApiRequest.getRequest(
              urlBase, "/info/mgrTypes", appId, secretKey, parkId, true, true, null));
      print(
          ApiRequest.getRequest(
              urlBase, "/info/carTypes", appId, secretKey, parkId, true, true, null));
      print(
          ApiRequest.getRequest(
              urlBase,
              "/info/rentRule",
              appId,
              secretKey,
              parkId,
              true,
              true,
              "{" + "\"mgrType\":1," + "\"carType\":1" + "}"));
      print(
          ApiRequest.getRequest(
              urlBase, "/info/space", appId, secretKey, parkId, true, true, null));
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  private void testFeerecord(String urlBase, String appId, String secretKey, long parkId) {
    String params =
        "{"
            + "\"startTime\":\"2018-10-13 10:00:00\","
            + "\"endTime\":\"2018-10-18 10:00:00\","
            + "\"offset\":0,"
            + "\"length\":100"
            + "}";
    try {
      print(
          ApiRequest.getRequest(
              urlBase,
              "/parkingFee/queryTmpRentRecords",
              appId,
              secretKey,
              parkId,
              true,
              true,
              params));
      params =
          "{"
              + "\"startDate\":\"2018-09-01\","
              + "\"endDate\":\"2018-10-18\","
              + "\"offset\":0,"
              + "\"length\":100"
              + "}";
      print(
          ApiRequest.getRequest(
              urlBase,
              "/parkingFee/queryLongRentRecords",
              appId,
              secretKey,
              parkId,
              true,
              true,
              params));
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  private void testPassrecord(String urlBase, String appId, String secretKey, long parkId) {
    String params =
        "{"
            + "\"startTime\":\"2018-10-13 10:00:00\","
            + "\"endTime\":\"2018-10-18 10:00:00\","
            + "\"offset\":0,"
            + "\"length\":100"
            + "}";
    try {
      print(
          ApiRequest.getRequest(
              urlBase,
              "/passrecord/queryCarRecords",
              appId,
              secretKey,
              parkId,
              true,
              true,
              params));
      params =
          "{"
              + "\"startTime\":\"2017-10-13 10:00:00\","
              + "\"endTime\":\"2018-10-18 10:00:00\","
              + "\"offset\":0,"
              + "\"length\":100"
              + "}";
      print(
          ApiRequest.getRequest(
              urlBase,
              "/passrecord/queryOnParkingRecords",
              appId,
              secretKey,
              parkId,
              true,
              true,
              params));
      print(
          ApiRequest.getRequest(
              urlBase, "/passrecord/queryAcRecords", appId, secretKey, parkId, true, true, params));
      params = "{" + "\"laneId\":3152324227111001," + "\"time\":\"2018-10-18 12:25:07\"" + "}";
      print(
          ApiRequest.getRequest(
              urlBase, "/passrecord/queryImageUrl", appId, secretKey, parkId, true, true, params));
      params =
          "{"
              + "\"laneId\":3152324227111001,"
              + "\"plateNumber\":\"JA11111\","
              + "\"time\":\"2018-10-18 12:25:07\""
              + "}";
      print(
          ApiRequest.postRequest(
              urlBase, "/passrecord/resetOutside", appId, secretKey, parkId, true, true, params));
      print(
          ApiRequest.postRequest(
              urlBase, "/passrecord/modifyPlate", appId, secretKey, parkId, true, true, params));
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  private void testPassport(String urlBase, String appId, String secretKey, long parkId) {
    try {
      print(
          ApiRequest.getRequest(
              urlBase,
              "/passport/query",
              appId,
              secretKey,
              parkId,
              true,
              true,
              "{" + "\"passportType\":1," + "\"offset\":0," + "\"length\":100" + "}"));
      print(
          ApiRequest.getRequest(
              urlBase,
              "/passport/get",
              appId,
              secretKey,
              parkId,
              true,
              true,
              "{" + "\"passportId\":5153905207416101" + "}"));
      print(
          ApiRequest.getRequest(
              urlBase, "/passport/invitationCode", appId, secretKey, parkId, true, true, null));
      print(
          ApiRequest.getRequest(
              urlBase,
              "/passport/hasPlateNumbers",
              appId,
              secretKey,
              parkId,
              true,
              true,
              "{" + "\"plateNumbers\":\"粤S6872T\"," + "\"passportId\":0" + "}"));
      print(
          ApiRequest.getRequest(
              urlBase,
              "/passport/hasCardNumbers",
              appId,
              secretKey,
              parkId,
              true,
              true,
              "{" + "\"cardNumbers\":\"12331434\"," + "\"passportId\":5153905207416101" + "}"));
      */
/*print(ApiRequest.postRequest(urlBase, "/passport/add", appId, secretKey, parkId, true, true,
		"{" +
				"\"passportType\":1," +
				"\"name\":\"小泊\"," +
				"\"address\":\"A101\"," +
				"\"mobilePhone\":\"13318992101\"," +
				"\"mgrType\":1," +
				"\"carType\":1," +
				"\"plateNumber\":\"粤BXP011\"," +
				"\"spacenum\":1," +
				"\"sharePlates\":\"粤BXP012,粤BXP013\"," +
				"\"parkAuth\":{\"areaIds\":[1150294495441301]}" +
				"}"));
print(ApiRequest.postRequest(urlBase, "/passport/update", appId, secretKey, parkId, true, true,
		"{" +
				"\"passportType\":1," +
				"\"passportId\":5153984718153001," +
				"\"name\":\"小泊\"," +
				"\"address\":\"A102\"," +
				"\"mobilePhone\":\"13318992101\"," +
				"\"mgrType\":1," +
				"\"carType\":1," +
				"\"plateNumber\":\"粤BXP011\"," +
				"\"spacenum\":1," +
				"\"sharePlates\":\"粤BXP012,粤BXP013\"," +
				"\"parkAuth\":{\"areaIds\":[1150294495441301]}" +
				"}"));

print(ApiRequest.postRequest(urlBase, "/passport/renew", appId, secretKey, parkId, true, true,
		"{" +
				"\"plateNumber\":\"粤BXP011\"," +
				"\"startDate\":\"2018-10-01\"," +
				 "\"endDate\":\"2018-10-31\"," +
				 "\"period\":1," +
				 "\"money\":100" +
				"}"));*//*

                print(
                    ApiRequest.postRequest(
                        urlBase,
                        "/passport/delete",
                        appId,
                        secretKey,
                        parkId,
                        true,
                        true,
                        "{" + "\"passportType\":1," + "\"passportId\":5153984718153001" + "}"));
              } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
              }
            }

            private void testAuth(String urlBase, String appId, String secretKey, long parkId) {
              try {
                */
/*print(ApiRequest.postRequest(urlBase, "/auth/enter", appId, secretKey, parkId, true, true,
"{" +
		 "\"laneId\":3152324227111001," +
		 "\"userId\":\"myapp12333456\"" +
		"}"));*//*

          print(
              ApiRequest.postRequest(
                  urlBase,
                  "/auth/exit",
                  appId,
                  secretKey,
                  parkId,
                  true,
                  true,
                  "{" + "\"laneId\":3150751873141101," + "\"userId\":\"myapp12333456\"" + "}"));
          print(
              ApiRequest.postRequest(
                  urlBase,
                  "/auth/refreshParkingFee",
                  appId,
                  secretKey,
                  parkId,
                  true,
                  true,
                  "{" + "\"laneId\":3150751873141101," + "\"userId\":\"myapp12333456\"" + "}"));
          print(
              ApiRequest.postRequest(
                  urlBase,
                  "/auth/queryEvent",
                  appId,
                  secretKey,
                  parkId,
                  true,
                  true,
                  "{" + "\"laneId\":3152324227111001," + "\"userId\":\"myapp12333456\"" + "}"));
          */
/*print(ApiRequest.postRequest(urlBase, "/auth/access", appId, secretKey, parkId, true, true,
"{" +
		 "\"laneId\":3152324227111001," +
		 "\"userId\":\"myapp12333456\"" +
		"}"));*//*

            } catch (Exception e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
            }
          }

          private void testCoupon(String urlBase, String appId, String secretKey, long parkId) {
            try {
              print(
                  ApiRequest.getRequest(
                      urlBase,
                      "/coupon/quota",
                      appId,
                      secretKey,
                      parkId,
                      true,
                      true,
                      "{" + "\"mchId\":11153533926629301," + "\"ruleId\":12153533963248901" + "}"));
              print(
                  ApiRequest.getRequest(
                      urlBase,
                      "/coupon/rule",
                      appId,
                      secretKey,
                      parkId,
                      true,
                      true,
                      "{" + "\"mchId\":11153533926629301," + "\"ruleId\":12153533963248901" + "}"));
              print(
                  ApiRequest.getRequest(
                      urlBase,
                      "/coupon/rules",
                      appId,
                      secretKey,
                      parkId,
                      true,
                      true,
                      "{" + "\"mchId\":11153533926629301" + "}"));
              print(
                  ApiRequest.getRequest(
                      urlBase, "/coupon/merchants", appId, secretKey, parkId, true, true, null));
              print(
                  ApiRequest.getRequest(
                      urlBase,
                      "/coupon/queryCoupons",
                      appId,
                      secretKey,
                      parkId,
                      true,
                      true,
                      "{"
                          + "\"mchId\":11153533926629301,"
                          + "\"date\":\"2018-10-17\","
                          + "\"offset\":0,"
                          + "\"length\":100"
                          + "}"));
              print(
                  ApiRequest.postRequest(
                      urlBase,
                      "/coupon/add",
                      appId,
                      secretKey,
                      parkId,
                      true,
                      true,
                      "{"
                          + "\"mchId\":11153533926629301,"
                          + "\"ruleId\":12153533963248901,"
                          + "\"plateNumber\":\"粤ZF023澳\""
                          + "}"));
            } catch (Exception e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
            }
          }

          private void testPay(String urlBase, String appId, String secretKey, long parkId) {
            try {
              */
/*print(ApiRequest.getRequest(urlBase, "/pay/queryLongRentBill", appId, secretKey, parkId, true, true,
		"{" +
				 "\"plateNumber\":\"京A0006警\"," +
				 "\"startDate\":\"2019-01-01\"," +
				 "\"period\":1," +
				 "\"userId\":\"myapp12333456\"" +
				"}"));
print(ApiRequest.getRequest(urlBase, "/pay/queryTmpRentBill", appId, secretKey, parkId, true, true,
		"{" +
				"\"plateNumber\":\"晋O00888\"," +
				"\"userId\":\"myapp12333456\"" +
				"}"));*//*

                print(
                    ApiRequest.postRequest(
                        urlBase,
                        "/pay/payLongRentBill",
                        appId,
                        secretKey,
                        parkId,
                        true,
                        true,
                        "{"
                            + "\"plateNumber\":\"京A0006警\","
                            + "\"payToken\":\"dCRv0w18QI9Fvzd1ed65lVC35mksaLT1Hy5RhsMDzwt/hLI7D3l7Hkp2skjprk061Uw+hwUaCuPa2/aXhGxHFkgl0lGsHo1X2u13xgfxDibFwB9r/vUJGPUUPMlOb1MjVdTBx+hFQBNbn36PFmOccU8uKy21WR5Jh02cdLl2i5oqKFbYBkUQl+D4YnuF9XhFXuDTbjbW0OhC7vltjCiHUf29DU/3kL919kCo/rCGsYh84QQGcbUaQFHc7MWqPZzwPJP2LQm6ILh0Q0hM/eAktKZo8J7Xu5RxXGdzmjTzXdcHkT24+1LqZdO+82cKQEIUH1of9iyEhq2ZWNWOQE5b68aDjrcINZtQmyFyBSnDol11eEiGrhnFBEAHLvwkGPRMXxVwTWRnji2KzpMrwuZnCg9SO+b5y1Z+WhtbWQGXMlsaS3jg0mJYANLpwBGQoOFXYBEdEP54cRe0htgcX1IlFA\u003d\u003d$1539919301180\""
                            + "}"));
                print(
                    ApiRequest.postRequest(
                        urlBase,
                        "/pay/payTmpRentBill",
                        appId,
                        secretKey,
                        parkId,
                        true,
                        true,
                        "{"
                            + "\"plateNumber\":\"晋O00888\","
                            + "\"payToken\":\"yczjDIMR/SCnEjd04o42bbpYch27APV8U9AuX+VZ86tYSTUG48n0R060WWbYX1Nrm//zhGVyjo85Cu17Qp58659ODz1hYp2e1xesdmJtj6fNHLzqf4S6XCXF3ro/F1EwxNTuLgFvUqK90LjAPCnhcHG+ymck6nTt5cB0wXhLna/E1O4uAW9Sor3QuMA8KeFwT4uK9F5peCPpks+qfUVuD5+fNaSPQyExq6TOHKgQwrofsHSmiei5XQPqsfXcngYoIGKf4skpiDO64Z64/uN+4XqMbDeFPMgSky3/bVEkKwnSVSDAIjwcWYHWQGWmoU2FLH8aZOJPYmccpx7CSxdE+HApmfWtaocpDq9rObIxBngz5z1jLoZGM91wr4TuDZDhryAgg7BVT/PYWN6nnV6OLNf00NAtHddfGrzd/N2OT6pmeRKTQF42+zx+t8IIw+D1F6VyyRuexyhMPVgLhx78ywOhPWn6ODvByCJl4LBfhu5UYzsp4UygAuN2SByAgTfqBiohparXigMxcE1MDcWcUXN6Ky7LpVObJumfLyzddWC/+7mL98jEliTFjRKlQhtLL73sjj5iw/jIabFFfC8/2efmxNI2VuF7jgOOlny4hcQ\u003d$1539919301301\""
                            + "}"));
              } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
              }
            }

            public static void main(String[] args) {
              */
/*Map<String, String> m = new HashMap<String, String>();
String contentData = "";
m.put(EncodeUtils.FIELD_APPID, "289efb7512e54146273b982456b03f42ea93");
m.put(EncodeUtils.FIELD_TENANTID, "10001088");
if (contentData!=null) {
	m.put(EncodeUtils.FIELD_ENCRYPTCODE, "0");
	m.put(EncodeUtils.FIELD_ZIPCODE, "0");
	m.put(EncodeUtils.FIELD_CONTENT, contentData);
}
m.put(EncodeUtils.FIELD_NONCE, "11886");
m.put(EncodeUtils.FIELD_TIMESTAMP, "1484718385");
String signature, urlEncode;
try {
	signature = EncodeUtils.generateSignature(m, "27a06832a2214a4fa3b7105e4a72d370");
	urlEncode = URLEncoder.encode(signature);
	System.out.println("signature:" + signature);
	System.out.println("urlEncode:" + urlEncode);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}*//*

   String urlBase = "http://qqb.welinkpark.com/api";
   String appId = "zxwyc66d3ea42fdc1ae88d30f8713e2de50c";
   String secretKey = "946ee6a83398bcf1b2f2e749bcae2d77";
   long parkId = 10005336;
   ApiTest test = new ApiTest();
   // test.testQueryAreas(urlBase, appId, secretKey, parkId); // 区域号 ：1162676772811601
   test.testCreateBooking(urlBase, appId, secretKey, parkId);
   // test.testInfo(urlBase, appId, secretKey, parkId);
   */
/*test.testFeerecord(urlBase, appId, secretKey, parkId);
test.testPassrecord(urlBase, appId, secretKey, parkId);
test.testPassport(urlBase, appId, secretKey, parkId);
test.testAuth(urlBase, appId, secretKey, parkId);
test.testCoupon(urlBase, appId, secretKey, parkId);
test.testPay(urlBase, appId, secretKey, parkId);*//*


                                                  */
/* System.out.println(URLEncoder.encode("=="));*//*

                                                   }
                                                 }
                                                 */
