package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author ：duyd@segimail.com
 * @class ：thread.UnsafeBuyTicket
 * @date ：Created in 2024/3/22 10:58
 * @description：并发买票 ReentrantLock
 * @modified By：
 * @version:
 */
public class SafeBuyTicket {
    public static void main(String[] args) {
        GoBuyTicket goBuyTicket = new GoBuyTicket();

        new Thread(goBuyTicket,"小明").start();
        new Thread(goBuyTicket,"小陈").start();
        new Thread(goBuyTicket,"小杜").start();
    }


}
class SafeGoBuyTicket implements Runnable{
    private int ticket = 10;

    private boolean flag = true;
    private final ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while (flag){
            try {
                //获取锁
                lock.lock();
                buy();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                //释放锁
                lock.unlock();
            }
        }
    }

    /***
     * 通过synchronized 锁定方法的当前对象来实现 安全机制 this.
     * @throws InterruptedException
     */
    public void buy() throws InterruptedException {
        if(ticket <= 0){
            flag = false;
            return;
        }
        Thread.sleep(5);
        System.out.println(Thread.currentThread().getName()+"买了第"+ticket--);

    }
}