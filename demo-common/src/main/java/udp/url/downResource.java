package udp.url;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author ：duyd@segimail.com
 * @class ：udp.url.downResource
 * @date ：Created in 2024/3/20 14:37
 * @description：
 * @modified By：
 * @version:
 */
public class downResource {
    public static void main(String[] args) throws Exception {
        //路径
        URL url = new URL("https://m804.music.126.net/20240320150401/af666fb92da888edffe3a24a1989443a/jdyyaac/obj/w5rDlsOJwrLDjj7CmsOj/34074358668/b800/5b58/34ad/85f1feaf98082cd696f4a66195713d6d.m4a?authSecret=0000018e5a95a9d007a20aaba54601ad");
        //打开连接
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        //获取流
        InputStream is = connection.getInputStream();

        FileOutputStream fos = new FileOutputStream("d6d.m4a");

        byte[] bytes = new byte[1024];
        int len;
        while ((len=is.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }
        fos.close();
        is.close();
        connection.disconnect();
    }
}
