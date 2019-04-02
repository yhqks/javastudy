package com.yks.test;

public class threadStation  implements  Runnable {
	 static int tick = 20;
	Object o="test";
	
	public void run() {
		while (tick > 0) {
	        synchronized (o) {// 这个很重要，必须使用一个锁，
	          // 进去的人会把钥匙拿在手上，出来后才把钥匙拿让出来
	          if (tick > 0) {
	            System.out.println(Thread.currentThread().getName() + "卖出了第" + tick + "张票");
	            tick--;
	          } else {
	            System.out.println("票卖完了");
	          }
	        }
	}
}
	  public static void main(String[] args) {
		  threadStation station1=new threadStation();
		  new Thread(station1,"one").start();
		  new Thread(station1,"two").start();
		  new Thread(station1,"three").start();
		  new Thread(station1,"four").start();

	}
}

