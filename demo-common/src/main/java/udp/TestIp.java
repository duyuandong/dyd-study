package udp;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author ：duyd@segimail.com
 * @class ：udp.TestIp
 * @date ：Created in 2024/3/18 17:47
 * @description：
 * @modified By：
 * @version:
 */
public class TestIp {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
    }
}
