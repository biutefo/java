package pers.xin.thread;

/**
 * 事项Runnable接口可以共享数据
 *
 * @author xin
 * @create 2019-03-06 3:55 PM
 **/
public class RunnableThread implements Runnable {
    private int ticket = 10;

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (this.ticket > 0) {
                System.out.println(Thread.currentThread().getName() + " 卖票：ticket" + this.ticket--);
            }
        }
    }
}
