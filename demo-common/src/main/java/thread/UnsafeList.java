package thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：duyd@segimail.com
 * @class ：thread.UnsafeList
 * @date ：Created in 2024/3/22 15:24
 * @description：不安全的集合
 * @modified By：
 * @version:
 */
public class UnsafeList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            new Thread(()-> {
                synchronized (list){
                    list.add(Thread.currentThread().getName());
                }
            }).start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(list.size());
    }
}
