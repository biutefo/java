package pers.xin.thread.demotest;

import pers.xin.thread.SyncThread;

public class SyncThreadTest {

	public static void main(String[] args) {
		//因为synchronized是加在对象上的锁，所以由两个线程对象创建的线程会出现并发。
		SyncThread thread1 = new SyncThread();
		SyncThread thread2 = new SyncThread();
		thread1.start();
		thread2.start();
	}

}
