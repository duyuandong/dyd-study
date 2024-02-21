package com.dyd.third.zhixing.core;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

public class CryptUtils {
  /** 密钥算法 */
  private static final String KEY_ALGORITHM = "AES";
  /**
   * 解密
   *
   * @param data 待解密数据
   * @param key 密钥
   * @return byte[] 解密数据
   * @throws Exception
   */
  public static String decrypt(byte[] data, byte[] key) throws Exception {
    // 还原密钥
    Key k = new SecretKeySpec(key, KEY_ALGORITHM);
    /** 实例化 使用PKCS7Padding填充方式，按如下方式实现 Cipher.getInstance(CIPHER_ALGORITHM,"BC"); */
    Cipher cipher = Cipher.getInstance(KEY_ALGORITHM);
    // 初始化，设置解密模式
    cipher.init(Cipher.DECRYPT_MODE, k);
    // 执行操作
    return new String(cipher.doFinal(data), "UTF-8");
  }

  /**
   * 解密
   *
   * @param data 待解密数据
   * @param key 密钥
   * @return byte[] 解密数据
   * @throws Exception
   */
  public static String decrypt(String data, String key) throws Exception {
    return decrypt(Base64.decodeBase64(data), getTrueKey(key).getBytes());
  }

  /**
   * 加密
   *
   * @param data 待加密数据
   * @param key 密钥
   * @return bytes[] 加密数据
   * @throws Exception
   */
  public static byte[] encrypt(byte[] data, byte[] key) throws Exception {
    // 还原密钥
    Key k = new SecretKeySpec(key, KEY_ALGORITHM);
    /** 实例化 使用PKCS7Padding填充方式，按如下方式实现 Cipher.getInstance(CIPHER_ALGORITHM,"BC"); */
    Cipher cipher = Cipher.getInstance(KEY_ALGORITHM);
    // 初始化，设置为加密模式
    cipher.init(Cipher.ENCRYPT_MODE, k);
    // 执行操作
    return cipher.doFinal(data);
  }

  public static String encrypt(String data, String key) throws Exception {
    byte[] dataBytes = data.getBytes("UTF-8");
    byte[] keyBytes = getTrueKey(key).getBytes();
    return Base64.encodeBase64String(encrypt(dataBytes, keyBytes));
  }

  private static String getTrueKey(String key) {
    String osName = System.getProperty("os.name");
    if (osName.matches("^(?i)Windows.*$")) {
      if (key.getBytes().length > 16) {
        return key.substring(0, 16);
      }
    }
    return key;
  }
}
