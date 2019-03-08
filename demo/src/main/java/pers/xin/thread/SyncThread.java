package pers.xin.thread;

public class SyncThread extends Thread{

	@Override
	public void run() {
		synchronized(this){
			for(int i=0;i<100;i++) {
				System.out.println(Thread.currentThread().getName()+"------------");
			}
		}
	}
}
