package pers.xin.thread.threadclass;

/**
 * 模拟数据库的增删改查方法
 * 
 * @author xin.li
 *
 */
public class DBDemo {

	/**
	 * 增加数据
	 */
	public void create() {
		synchronized (this) {
			for (int i = 1; i <= 100; i++) {
				System.out.println(Thread.currentThread().getName() + "---正在增加数据---" + i);
			}
		}
	}

	/**
	 * 查找数据（没有synchronized）
	 */
	public void read() {

		for (int i = 1; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + "---正在查找数据---" + i);
		}

	}

	/**
	 * 修改数据
	 */
	public void update() {
		synchronized (this) {
			for (int i = 1; i <= 100; i++) {
				System.out.println(Thread.currentThread().getName() + "---正在修改数据---" + i);
			}
		}
	}

	/**
	 * 删除数据
	 */
	public void delete() {
		synchronized (this) {
			for (int i = 1; i <= 100; i++) {
				System.out.println(Thread.currentThread().getName() + "---正在删除数据---" + i);
			}
		}
	}
}
