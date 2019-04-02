package com.yks.test;

import java.util.ArrayList;
import java.util.List;

public class FastSort {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <=9; i++) {
			list.add(i);
		}
		System.out.println(list);
		Fast(list, 0, list.size() - 1);

		System.out.println(list);

	}

	private static void Fast(List<Integer> list, int i, int j) {
		int start, end, index;
		if (i > j) {
			return;
		}
		start = i;
		end = j;
		index = list.get(i);
		while (start < end) {
			while (end > start && list.get(end) >=index)
				end--;
			if (start < end) {
				list.set(start, list.get(end));
				
			}
			while (end > start&& list.get(start) < index) {
				start++;
				if (end > start) {
					list.set(end, list.get(start));
				}
			}
		}

		list.set(start, index);
		Fast(list, i, start - 1);
		Fast(list, start + 1, j);
	}

}
