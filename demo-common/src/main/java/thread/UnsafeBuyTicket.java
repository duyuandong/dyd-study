package thread;

/**
 * @author ：duyd@segimail.com
 * @class ：thread.UnsafeBuyTicket
 * @date ：Created in 2024/3/22 10:58
 * @description：并发买票 (线程不安全)
 * @modified By：
 * @version:
 */
public class UnsafeBuyTicket {
    public static void main(String[] args) {
        GoBuyTicket goBuyTicket = new GoBuyTicket();

        new Thread(goBuyTicket,"小明").start();
        new Thread(goBuyTicket,"小陈").start();
        new Thread(goBuyTicket,"小杜").start();
    }


}
class GoBuyTicket implements Runnable{
    private int ticket = 10;

    private boolean flag = true;

    @Override
    public void run() {
        while (flag){
            try {
                buy();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /***
     * 通过synchronized 锁定方法的当前对象来实现 安全机制 this.
     * @throws InterruptedException
     */
    public synchronized void buy() throws InterruptedException {
        if(ticket <= 0){
            flag = false;
            return;
        }
        Thread.sleep(5);
        System.out.println(Thread.currentThread().getName()+"买了第"+ticket--);

    }
}