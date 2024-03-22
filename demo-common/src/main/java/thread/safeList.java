package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author ：duyd@segimail.com
 * @class ：thread.UnsafeList
 * @date ：Created in 2024/3/22 15:24
 * @description：安全的集合
 * @modified By：
 * @version:
 */
public class safeList {
    public static void main(String[] args) {
        //JUC包里面的并发类
        CopyOnWriteArrayList list = new CopyOnWriteArrayList();
        for (int i = 0; i < 10000; i++) {
            new Thread(()-> {
                list.add(Thread.currentThread().getName());
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
