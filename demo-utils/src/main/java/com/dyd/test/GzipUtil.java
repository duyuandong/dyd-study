package com.dyd.test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class GzipUtil {

  public static String uncompress(ByteArrayInputStream in, String charset) {

    try {

      GZIPInputStream gInputStream = new GZIPInputStream(in);

      byte[] by = new byte[1024];

      StringBuffer strBuffer = new StringBuffer();

      int len = 0;

      while ((len = gInputStream.read(by)) != -1) {

        strBuffer.append(new String(by, 0, len, charset));
      }

      return strBuffer.toString();

    } catch (IOException e) {

      e.printStackTrace();
    }

    return null;
  }
}
