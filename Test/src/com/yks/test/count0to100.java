package com.yks.test;

import java.util.ArrayList;
import java.util.LinkedList;

public class count0to100 implements Runnable {
	private int startNum;
	public static int sum;

	public count0to100(int startNum) {
		this.startNum = startNum;
		System.out.println(Thread.currentThread().getName()+"startnum:"+startNum);
	}

	public static synchronized void add(int num) {
		sum += num;

	}
	
	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i <10; i++) {
			sum = startNum + i + sum;
		}

		System.out.println(Thread.currentThread().getName() + "µ±Ç°sumÎª" + sum);

		add(sum);
	}

	public static void main(String[] args) {
     int l=0;
      ArrayList<Thread> list=new ArrayList<Thread>();
		for (int i = 0; i < 10; i++) {		
			int j=10*i+1;
			count0to100 t=new count0to100(j);
			list.add(new Thread(t,i+"ºÅ"));
		
			list.get(i).start();
		}
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
