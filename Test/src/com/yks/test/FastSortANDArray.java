package com.yks.test;

import java.util.Arrays;

public class FastSortANDArray {
	 public static void sort(int a[], int low, int hight) {
	        int i, j, index;
	        if (low > hight) 
	            return;

	        i = low;
	        j = hight;
	        index = a[i]; // 用子表的第一个记录做基准
	        
	        
	        while (i < j) { // 从表的两端交替向中间扫描
	            while (i < j && a[j] >= index)
	                j--;
	            if (i < j)
	                swap(a,i,j);//将比基准小的数字和基准进行交换
	            while (i < j && a[i] < index)
	                i++;
	            if (i < j) // 将比基准大的数字和基准进行交换
	            	 swap(a,i,j);
	        }
	        
	        
	        
	        sort(a, low, i - 1); // 对低子表进行递归排序
	        sort(a, i + 1, hight); // 对高子表进行递归排序

	    }

	    public static void quickSort(int a[]) {
	        sort(a, 0, a.length - 1);
	    }
	    
	    public static void swap(int[] a,int i,int j) {
	    	int temp=a[i];
	    	a[i]=a[j];
	    	a[j]=temp;	    	
	    }

	    public static void main(String[] args) {

	        int a[] = { 5,4,2,6,1,0 };
	        quickSort(a);
	        System.out.println(Arrays.toString(a));
	    }

}
