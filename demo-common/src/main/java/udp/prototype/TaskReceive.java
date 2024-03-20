package udp.prototype;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author ：duyd@segimail.com
 * @class ：udp.prototype.TaskReceive
 * @date ：Created in 2024/3/19 18:08
 * @description：
 * @modified By：
 * @version:
 */
public class TaskReceive implements Runnable{
    private String name;
    private int port;

    private DatagramSocket socket = null;


    public TaskReceive(String name, int port) {
        this.name = name;
        try {
            //开放端口
            socket = new DatagramSocket(port);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        try {
            while (true){
                //接收数据包
                byte[] bytes = new byte[1024];
                DatagramPacket dataPacket = new DatagramPacket(bytes,0,bytes.length);
                //接收数据
                socket.receive(dataPacket);//阻塞
                String text = new String(dataPacket.getData(), 0, dataPacket.getData().length);
                //打印消息
                System.out.println(this.name +": " +text.trim());

                if("bye".equals(text.trim())){
                    break;
                }
            }
            socket.close();
            System.out.println("socket关闭...");
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
