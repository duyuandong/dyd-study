package com.dyd.utils.sc;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.dyd.utils.AssertUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Enumeration;

/** 验签和加签工具类 */
@Slf4j
public class SignatureUtils {

  private static String pfxPath =
      "E:\\dyd-work\\project\\demo-service\\src\\main\\resources\\certificate\\103881013982890.pfx";

  private static String keystoreKey = "Ab111111";

  private static String publicCerpath =
      "E:\\dyd-work\\project\\demo-service\\src\\main\\resources\\certificate\\TrustPay.cer";

  /** 接收报文返回requestBody和使用base64解析后的requestBody以及缴费中心传送的签名 */
  public static SCRequestCommonDto vrifyRequestBody(String requestContent) {
    SCRequestCommonDto scRequestCommonDto = new SCRequestCommonDto<>();
    AssertUtil.isTrue(StringUtils.isNotBlank(requestContent), "农行请求的报文不能为空");
    AssertUtil.isTrue(requestContent.contains("||"), "农行请求参数不符合双方约定规范,请检查");
    // 获取缴费中心传送过来的签名
    String signatureString = requestContent.substring(0, requestContent.indexOf("||"));
    // 解析前的requestBody
    String requestBody = requestContent.substring(signatureString.length() + 2);
    log.info("截取报文的base64:requestBody解密前:{}", requestBody);
    scRequestCommonDto.setRequestBody(requestBody);
    // 使用base64解析完成后的requestBody
    String requestBodyOfDecoded =
        new String(com.alibaba.fastjson.util.Base64.decodeFast(requestBody));
    log.info("截取报文的加密参数signatureString:{}", signatureString);
    log.info("解析完成后的requestBody:{}", requestBodyOfDecoded);
    scRequestCommonDto.setSignatureString(signatureString);
    scRequestCommonDto.setRequestBodyOfDecoded(requestBodyOfDecoded);
    return scRequestCommonDto;
  }

  /**
   * 读取cer并验证公钥签名
   *
   * @return
   */
  public static void readCerAndVrifySign(SCRequestCommonDto commonDto) {
    AssertUtil.isTrue(StringUtils.isNotBlank(publicCerpath), "SC_ABCBANK_TRUSTPAY_PATH商户验签证书路径未配置");
    AssertUtil.isTrue(
        StringUtils.isNotBlank(commonDto.getRequestBody())
            && StringUtils.isNotBlank(commonDto.getSignatureString()),
        "农行签名校验失败,必传字段为空");
    boolean flag = false;
    try {
      CertificateFactory cf = CertificateFactory.getInstance("X.509");
      FileInputStream fileInputStream = new FileInputStream(new File(publicCerpath));
      X509Certificate cert = (X509Certificate) cf.generateCertificate(fileInputStream);
      PublicKey publicKey = cert.getPublicKey();
      String publicKeyString = new String(Base64.encodeBase64(publicKey.getEncoded()));
      log.debug("扬子国投农行支付公钥：{}", publicKeyString);
      Signature verifySign = Signature.getInstance("SHA1withRSA");
      verifySign.initVerify(publicKey);
      // 用于验签的数据
      verifySign.update(commonDto.getRequestBody().getBytes("utf-8"));
      flag =
          verifySign.verify(
              com.alibaba.fastjson.util.Base64.decodeFast(commonDto.getSignatureString()));
    } catch (Exception e) {
      log.error("农行签名校验失败:", e);
      AssertUtil.isTrue(flag, "签名校验失败");
    }
    AssertUtil.isTrue(flag, "签名校验失败");
  }

  /**
   * 加签名
   *
   * @param responseObj
   * @return
   */
  public static String signData(Object responseObj) {
    AssertUtil.isTrue(StringUtils.isNotBlank(pfxPath), "SC_ABCBANK_PFX_PATH商户签名证书路径未配置");
    AssertUtil.isTrue(StringUtils.isNotBlank(keystoreKey), "SC_ABCBANK_PFX_KEY证书密码未配置");
    String signatureString = null, responseJson = JSON.toJSONString(responseObj);
    ;
    try {
      KeyStore ks = KeyStore.getInstance("PKCS12");
      FileInputStream fis = new FileInputStream(pfxPath);
      char[] nPassword = keystoreKey.toCharArray();
      ks.load(fis, nPassword);
      fis.close();
      Enumeration<String> enums = ks.aliases();
      String keyAlias = null;
      if (enums.hasMoreElements()) {
        keyAlias = enums.nextElement();
      }
      PrivateKey prikey = (PrivateKey) ks.getKey(keyAlias, nPassword);
      // SHA1withRSA算法进行签名
      Signature sign = Signature.getInstance("SHA1withRSA");
      sign.initSign(prikey);
      byte[] data = responseJson.getBytes("utf-8");
      byte[] dataBase = Base64.encodeBase64(data);
      // 更新用于签名的数据
      sign.update(dataBase);
      byte[] signature = sign.sign();
      signatureString = new String(Base64.encodeBase64(signature));
      log.info("responseJson打印结果是（responseJson加密前）:" + responseJson);
      responseJson = signatureString + "||" + new String(dataBase);
      log.info("responseJson打印结果是（responseJson加密后）:" + responseJson);
    } catch (Exception e) {
      log.error("农行支付加密报文发生异常：", e);
    }
    return responseJson;
  }

  public static void main(String[] args) {
    String data =
        "{\"format\":\"json\",\"message\":{\"head\":{\"channel\":\"EBNK\",\"transCode\":\"chargeBill\",\"transFlag\":\"01\",\"transSeqNum\":\"BP180827105846210047\",\"timeStamp\":\"20221123175347127\",\"branchCode\":\"2110\"},\"info\":{\"epayCode\":\"JF-EPAY2022052326508\",\"merchantId\":\"103881013982890\",\"userId\":\"1637206339848118\",\"traceNo\":\"JF180827105846813462\",\"input1\":\"PAK2019072416333716189737765\",\"input2\":\"CARD_PAY\",\"input3\":\"218\",\"amtRule\":\"0\",\"payBillCount\":\"1\",\"payBillAmt\":\"0.01\",\"payBillNo\":\"123456789\",\"payAcc\":\"14341101040000337\",\"payType\":\"EP004\",\"transPaySeq\":\"6TECEP01141537326502\",\"transDate\":\"20221123\",\"transTime\":\"174500\",\"settleDate\":\"20221123\",\"clearType\":\"REALTIME\",\"resendTimes\":\"0\"}}}";
    String aStatic = SignatureUtils.class.getClassLoader().getResource("certificate").getPath();
    System.out.println(aStatic);
    JSONObject respondeBodyJson = JSONObject.parseObject(data, Feature.OrderedField);
    String encodeKey = SignatureUtils.signData(respondeBodyJson);
    SCRequestCommonDto scRequestCommonDto = new SCRequestCommonDto();
    String signatureString = encodeKey.substring(0, encodeKey.indexOf("||"));
    String requestBody = encodeKey.substring(signatureString.length() + 2);
    scRequestCommonDto.setSignatureString(signatureString);
    scRequestCommonDto.setRequestBody(requestBody);

    String requestBodyOfDecoded =
        new String(com.alibaba.fastjson.util.Base64.decodeFast(requestBody));
    scRequestCommonDto.setRequestBodyOfDecoded(requestBodyOfDecoded);
    SignatureUtils.readCerAndVrifySign(scRequestCommonDto);
  }
}
