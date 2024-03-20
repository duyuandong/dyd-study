package thread;

/**
 * @author ：duyd@segimail.com
 * @class ：thread.Race
 * @date ：Created in 2024/3/20 16:23
 * @description：龟兔赛跑
 * @modified By：
 * @version: 1.0
 */
public class Race implements Runnable{
    private String winner;

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            //兔子睡觉
            if(Thread.currentThread().getName().equals("兔子") && i%10 == 0){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            //游戏结束
            if(gameOver(i)){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"跑了第"+i+"步");
        }
    }

    public boolean gameOver(int step){
        if(winner != null){
            return true;
        }{
            //当步数达到100时,选出胜出者
            if(step >= 100){
               winner = Thread.currentThread().getName();
               System.out.println("winner is "+ winner);
               return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();
        new Thread(race,"兔子").start();
        new Thread(race,"乌龟").start();
    }
}
