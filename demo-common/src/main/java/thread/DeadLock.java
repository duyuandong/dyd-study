package thread;

/**
 * @author ：duyd@segimail.com
 * @class ：thread.DeadLock
 * @date ：Created in 2024/3/22 15:49
 * @description：死锁(多个线程抱着对方的资源,然后形成僵持) ,你等着我用,我等着你用
 * @modified By：
 * @version:
 */
public class DeadLock {
    public static void main(String[] args) {
        Makeup hong = new Makeup(0, "小红");
        Makeup li = new Makeup(1, "小李");

        hong.start();
        li.start();
    }
}
//口红
class Lipstick{

}
//镜子
class Mirror{

}

class Makeup extends Thread{
    //资源只有一份
    static Lipstick ls = new Lipstick();
    static Mirror mr = new Mirror();

    int choice;//选择使用
    String girlName;

    Makeup(int choice,String girlName){
        this.choice = choice;
        this.girlName = girlName;
    }

    @Override
    public void run() {
        try {
            startMakeup();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void startMakeup() throws InterruptedException {
        if(choice == 0){
            //锁口红  这种会导致死锁
           /* synchronized (ls){
                System.out.println(this.girlName + "获得口红的锁对象");
                this.sleep(1000);
                synchronized (mr){
                    System.out.println(this.girlName + "获得镜子的锁对象");
                }
            }*/
            //改造
            synchronized (ls){
                System.out.println(this.girlName + "获得口红的锁对象");
                this.sleep(1000);
            }
            synchronized (mr){
                System.out.println(this.girlName + "获得镜子的锁对象");
            }
        }else{
            //锁口红
            /*synchronized (ls){
                System.out.println(this.girlName + "获得口红的锁对象");
                this.sleep(1000);
                synchronized (mr){
                    System.out.println(this.girlName + "获得镜子的锁对象");
                }
            }*/
            synchronized (ls){
                System.out.println(this.girlName + "获得口红的锁对象");
                this.sleep(1000);
            }
            synchronized (mr){
                System.out.println(this.girlName + "获得镜子的锁对象");
            }
        }
    }
}


