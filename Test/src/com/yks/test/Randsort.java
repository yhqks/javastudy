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

//�������������
public class Randsort {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();//��������
		ArrayList<Integer> aim = new ArrayList<Integer>();//��������
		// ����һ��list����
		for (int i = 0; i <= 5; i++) {
			list.add(i * 2);
		}
		// �������
		Random random = new Random();

		while (list.size() != 0) {
			//��������� ��0-��ǰ������֮��
			int rand = random.nextInt(list.size());
			//System.out.println(list.get(rand));
			
			//����randλ�����ݷ���aim
			aim.add(list.get(rand));
			list.remove(rand);

		}
		Object a[] = aim.toArray();
		for (Object object : a) {
			System.out.print(object);
		}

	}
}
