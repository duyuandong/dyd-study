package udp.prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

/**
 * @author ：duyd@segimail.com
 * @class ：udp.prototype.TaskSend
 * @date ：Created in 2024/3/19 17:53
 * @description：
 * @modified By：
 * @version:
 */
public class TaskSend implements Runnable{

    private String toIp;
    private int toPort;
    private int fromPort;
    private DatagramSocket socket = null;
    private DatagramPacket dataPacket = null;
    private BufferedReader buffer = null;
    public TaskSend(String toIp, int toPort, int fromPort) {
        this.fromPort = fromPort;
        this.toIp = toIp;
        this.toPort = toPort;
        try {
            socket = new DatagramSocket(fromPort);
            buffer = new BufferedReader(new InputStreamReader(System.in));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void run() {
        String text = null;
        while (true) {
            try {
                text = buffer.readLine();
                byte[] bytes = text.getBytes();
                //建立数据包
                dataPacket = new DatagramPacket(bytes, 0, bytes.length, InetAddress.getByName(this.toIp), this.toPort);
                //发送数据
                socket.send(dataPacket);
                if ("bye".equals(text.trim())) {
                    break;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        socket.close();
        System.out.println("socket关闭...");
    }
}
