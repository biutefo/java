package pers.xin.thread;

/**
 * 继承Thread类不能共享数据
 *
 * @author xin
 * @create 2019-03-06 3:54 PM
 **/
public class ExtendThread extends Thread {
    private int ticket = 10;

    public void run() {
        for (int i = 0; i < 20; i++) {
            if (this.ticket > 0) {
                System.out.println(this.getName() + " 卖票：ticket" + this.ticket--);
            }
        }
    }
}
