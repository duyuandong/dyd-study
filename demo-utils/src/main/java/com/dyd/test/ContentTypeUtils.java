package com.dyd.test;

import javax.activation.MimetypesFileTypeMap;
import java.io.File;
import java.io.IOException;
import java.net.FileNameMap;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Java获取文件ContentType
 *
 * @author ouyangjun
 */
public class ContentTypeUtils {

  public static void main(String[] args) {
    // 文件路径
    String fileUrl = "C:\\Users\\Administrator\\Desktop\\img\\boy-4.png";
    String fileUrl2 = "C:\\Users\\Administrator\\Desktop\\四格车场系统对接保利ERP系统接口需求_业务解决方案V1.0.doc";
    // 方式一
    getContentTypeByLocal(fileUrl);

    // 方式二,推荐使用
    getContentType(fileUrl);

    // 方式三
    getContentTypeByType(fileUrl);
  }

  /**
   * 方式一 该方式只支持本地文件,有时候会存在获取为null的情况
   *
   * @param fileUrl
   */
  public static String getContentTypeByLocal(String fileUrl) {
    String contentType = null;
    Path path = Paths.get(fileUrl);
    try {
      contentType = Files.probeContentType(path);
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("getContentTypeByLocal, File ContentType is : " + contentType);
    return contentType;
  }

  /**
   * 方式二 该方式支持本地文件，也支持http/https远程文件
   *
   * @param fileUrl
   */
  public static String getContentType(String fileUrl) {
    String contentType = null;
    try {
      contentType = new MimetypesFileTypeMap().getContentType(new File(fileUrl));
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("getContentType, File ContentType is : " + contentType);
    return contentType;
  }

  /**
   * 方式三
   *
   * @param fileUrl,有时候会存在获取为null的情况
   */
  public static String getContentTypeByType(String fileUrl) {
    String contentType = null;
    try {
      FileNameMap fileNameMap = URLConnection.getFileNameMap();
      contentType = fileNameMap.getContentTypeFor(fileUrl);
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("getContentTypeByType, File ContentType is : " + contentType);
    return contentType;
  }
}
