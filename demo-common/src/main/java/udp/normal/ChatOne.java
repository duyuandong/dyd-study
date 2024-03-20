package udp.normal;

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
public class ChatOne{
    public static void main(String[] args) throws Exception {
        //发送数据
        DatagramPacket dataPacket = null;
        try {
            InetAddress ip = InetAddress.getByName("127.0.0.1");
            int port = 9090;
            DatagramSocket socket = new DatagramSocket(9999);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            while (true){
                String text = buffer.readLine();
                byte[] bytes = text.getBytes();
                //建立数据包
                dataPacket = new DatagramPacket(bytes, 0, bytes.length, new InetSocketAddress(ip,port));
                //发送数据
                socket.send(dataPacket);

                if("bye".equals(text.trim())){
                    break;
                }
            }
            buffer.close();
            socket.close();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
