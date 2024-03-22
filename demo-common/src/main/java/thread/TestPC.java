package thread;

/**
 * @author ：duyd@segimail.com
 * @class ：thread.TestPC
 * @date ：Created in 2024/3/22 16:51
 * @description：生产者消费者模型 -> 利用缓冲区解决:管程法
 * @modified By：
 * @version:
 */
public class TestPC {
    public static void main(String[] args) {
        SyncContainer syncContainer = new SyncContainer();
        new Productor(syncContainer).start();
        new Consumer(syncContainer).start();
    }
}

//生产者
class Productor extends Thread{
    SyncContainer container;
    public Productor(SyncContainer container){
        this.container = container;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            container.push(new Chicken(i));
            System.out.println("生产了-->"+ i + "只鸡");
        }
    }
}
//消费者
class Consumer extends Thread{
    SyncContainer container;
    public Consumer(SyncContainer container){
        this.container = container;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("消费了-->"+ container.pop().id + "只鸡");
        }
    }
}
//产品
class Chicken{
    int id;

    public Chicken(int id) {
        this.id = id;
    }
}
//缓冲区
class SyncContainer{
    //容器大小
    Chicken[] chickens = new Chicken[10];
    //容器计数器
    int count = 0;

    //生产者放入产品
    public synchronized void push(Chicken chicken){
        if(count == chickens.length){
            //通知生产者等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        chickens[count] = chicken;
        count++;

        //通知消费者消费
        this.notify();
    }

    //消费者消费产品
    public synchronized Chicken pop(){
        if(count == 0){
            //通知生产者生产
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        count--;
        Chicken chicken = chickens[count];

        //通知生产者生产
        this.notify();
        return chicken;
    }
}

