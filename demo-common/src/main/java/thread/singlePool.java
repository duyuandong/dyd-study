package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ：duyd@segimail.com
 * @class ：thread.singlePool
 * @date ：Created in 2024/3/6 18:02
 * @description：
 * @modified By：
 * @version:
 */
public class singlePool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + i+" : ssd");
            }
        });
        executor.shutdown();
        System.out.println(Thread.currentThread().getName() + " : sddff");
    }
}
