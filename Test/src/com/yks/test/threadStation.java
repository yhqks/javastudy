package com.yks.test;

public class threadStation  implements  Runnable {
	 static int tick = 20;
	Object o="test";
	
	public void run() {
		while (tick > 0) {
	        synchronized (o) {// �������Ҫ������ʹ��һ������
	          // ��ȥ���˻��Կ���������ϣ�������Ű�Կ�����ó���
	          if (tick > 0) {
	            System.out.println(Thread.currentThread().getName() + "�����˵�" + tick + "��Ʊ");
	            tick--;
	          } else {
	            System.out.println("Ʊ������");
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

