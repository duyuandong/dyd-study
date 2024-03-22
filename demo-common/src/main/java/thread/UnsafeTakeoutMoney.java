package thread;

/**
 * @author ：duyd@segimail.com
 * @class ：thread.UnsafeTakeoutMoney
 * @date ：Created in 2024/3/22 14:39
 * @description：银行取钱(线程不安全)
 * @modified By：
 * @version:
 */
public class UnsafeTakeoutMoney {
    public static void main(String[] args) {
        Account account = new Account("结婚基金", 2000);

        Drawing i = new Drawing(account, 500, "我");
        Drawing wife = new Drawing(account, 1000, "老婆");
        //开启线程
        i.start();
        wife.start();
    }

}
//账户
class Account{
    String name;
    int money;

    public Account(String name, int money) {
        this.name = name;
        this.money = money;
    }
}

class Drawing extends Thread{
    Account account;

    //取了多少钱
    int drawingMoney;
    //你手里的钱(可以取多次)
    int nowMoney;

    public Drawing(Account account,int drawingMoney,String name){
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    /***
     * 通过synchronized同步代码块锁定变化的对象(账户Account), 而不是锁定run方法对象. 哪里变化就锁哪里
     * 监视器sync..(){} 锁的是增删改的对象
     */
    @Override
    public void run() {
        synchronized (account){
            if(account.money < 0 || account.money - drawingMoney < 0 ){
                System.out.println("【"+this.getName() + "】账户余额不足!");
                return;
            }
            try {
                this.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            account.money = account.money - drawingMoney;
            nowMoney = nowMoney + drawingMoney;

            System.out.println("【"+this.getName() + "】手里:" + nowMoney);
            System.out.println("结婚基金余额:" + account.money);
        }

    }
}
