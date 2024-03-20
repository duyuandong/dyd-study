package udp.prototype;

/**
 * @author ：duyd@segimail.com
 * @class ：udp.prototype.TalkC
 * @date ：Created in 2024/3/19 18:13
 * @description：
 * @modified By：
 * @version:
 */
public class TalkD {
    public static void main(String[] args) {
        new Thread(new TaskReceive("Jack",9009)).start();
        new Thread(new TaskSend("127.0.0.1",9008,6666)).start();;
    }
}
