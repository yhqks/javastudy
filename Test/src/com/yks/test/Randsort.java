package com.yks.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

//将数组随机排序
public class Randsort {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();//数据链表
		ArrayList<Integer> aim = new ArrayList<Integer>();//接受链表
		// 创建一个list链表
		for (int i = 0; i <= 5; i++) {
			list.add(i * 2);
		}
		// 随机种子
		Random random = new Random();

		while (list.size() != 0) {
			//产生随机数 在0-当前链表长度之间
			int rand = random.nextInt(list.size());
			//System.out.println(list.get(rand));
			
			//将在rand位的数据放入aim
			aim.add(list.get(rand));
			list.remove(rand);

		}
		Object a[] = aim.toArray();
		for (Object object : a) {
			System.out.print(object);
		}

	}
}
