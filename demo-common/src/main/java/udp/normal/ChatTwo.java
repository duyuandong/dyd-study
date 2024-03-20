package udp.normal;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ：duyd@segimail.com
 * @class ：udp.normal.ChatOne
 * @date ：Created in 2024/3/19 16:01
 * @description：
 * @modified By：
 * @version:
 */
public class ChatTwo{
    public static void main(String[] args) {
        try {
            //开放端口
            DatagramSocket socket = new DatagramSocket(9090);
            //接收数据包
            while (true){
                byte[] buffer = new byte[1024];
                DatagramPacket dataPacket = new DatagramPacket(buffer,0,buffer.length);

                //接收数据
                socket.receive(dataPacket);//阻塞
                String text = new String(dataPacket.getData(), 0, dataPacket.getData().length);
                //打印消息
                System.out.println(text.trim());

                if("bye".equals(text.trim())){
                    break;
                }
            }

        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
