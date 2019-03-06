package pers.xin.test;

import org.junit.Test;
import pers.xin.thread.ExtendThread;
import pers.xin.thread.RunnableThread;

/**
 * 测试
 *
 * @author xin
 * @create 2019-03-06 3:58 PM
 **/
public class ThreadTest {

    public static void main(String[] args) {
        /*ExtendThread thread1 = new ExtendThread();
        ExtendThread thread2 = new ExtendThread();
        ExtendThread thread3 = new ExtendThread();*/
        //RunnableThread runnableThread = new RunnableThread();
        //匿名内部类写法
        Thread runnableThread = new Thread(new Runnable() {
            private int ticket = 10;
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    if (this.ticket > 0) {
                        System.out.println(Thread.currentThread().getName() + " 卖票：ticket" + this.ticket--);
                    }
                }
            }
        });
        Thread thread1 = new Thread(runnableThread);
        Thread thread2 = new Thread(runnableThread);
        Thread thread3 = new Thread(runnableThread);
        thread1.start();
        thread2.start();
        thread3.start();

    }

}
