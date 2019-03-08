package pers.xin.thread.demotest;

import pers.xin.thread.threadclass.DBDemo;

public class DBDemoTest {

	public static void main(String[] args) throws Exception {
		DBDemo dbDemo = new DBDemo();
		Thread creadThread = new Thread(new Runnable() {

			@Override
			public void run() {
				dbDemo.create();
			}

		});
		Thread readThread = new Thread(new Runnable() {

			@Override
			public void run() {
				dbDemo.read();
			}

		});
		Thread _readThread = new Thread(new Runnable() {

			@Override
			public void run() {
				dbDemo.read();
			}

		});
		Thread __readThread = new Thread(new Runnable() {

			@Override
			public void run() {
				dbDemo.read();
			}

		});
		Thread updateThread = new Thread(new Runnable() {

			@Override
			public void run() {
				dbDemo.update();
			}

		});
		Thread deleteThread = new Thread(new Runnable() {

			@Override
			public void run() {
				dbDemo.delete();
			}

		});
		// 任意两个增删改查的操作直接可以看作两个线程，由于增删改会改变表所以需要事务控制，
		// 对应到线程中就是对于的操作方法是同步的，而查操作不会改变表，所以方法非同步。

		// 写操作（增删改）操作和写操作（增删改）是不能同时进行的。不存在并发
		creadThread.start();
		updateThread.start();
		creadThread.join(0);
		updateThread.join(0);
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println();
		// 读操作（查）和写操作（增删改）也是不能同时进行的。如果如下所示会出现并发问题，应该考虑事务的传播行为。
		readThread.start();
		deleteThread.start();
		readThread.join(0);
		deleteThread.join(0);
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println();
		// 写操作（查）和写操作（查）是能够同时进行的。存在并发
		_readThread.start();
		__readThread.start();
		_readThread.join(0);
		__readThread.join(0);
		
	}

}
