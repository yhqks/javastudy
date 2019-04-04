package com.yks.test;

import java.util.ArrayList;
import java.util.LinkedList;

public class count0to100 implements Runnable {
	private int startNum;
	public static int sum;

	
	//记录从那个数字开始加
	public count0to100(int startNum) {
		this.startNum = startNum;
		System.out.println(Thread.currentThread().getName()+"startnum:"+startNum);
	}

	public static synchronized void add(int num) {
		sum += num;

	}
	
	/*
	 * 将startnum叠加
	 * 
	 * */
	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i <10; i++) {
			sum = startNum + i + sum;
		}

		System.out.println(Thread.currentThread().getName() + "当前sum为" + sum);

		add(sum);
	}

	public static void main(String[] args) {
     int l=0;
      ArrayList<Thread> list=new ArrayList<Thread>();
      
      //创建十个线程  计算从startnum到startnum+10的和
		for (int i = 0; i < 10; i++) {		
			int j=10*i+1;
			count0to100 t=new count0to100(j);
			list.add(new Thread(t,i+"号"));
		
			list.get(i).start();
		}
		
		//让线程依次执行 保证num的准确
		for (int i = 0; i < 10; i++) {
			try {
				list.get(i).join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Sum is : " + sum);
	}

}
