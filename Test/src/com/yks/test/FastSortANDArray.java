package com.yks.test;

import java.util.Arrays;

public class FastSortANDArray {
	 public static void sort(int a[], int low, int hight) {
	        int i, j, index;
	        if (low > hight) 
	            return;

	        i = low;
	        j = hight;
	        index = a[i]; // ���ӱ�ĵ�һ����¼����׼
	        
	        
	        while (i < j) { // �ӱ�����˽������м�ɨ��
	            while (i < j && a[j] >= index)
	                j--;
	            if (i < j)
	                swap(a,i,j);//���Ȼ�׼С�����ֺͻ�׼���н���
	            while (i < j && a[i] < index)
	                i++;
	            if (i < j) // ���Ȼ�׼������ֺͻ�׼���н���
	            	 swap(a,i,j);
	        }
	        
	        
	        
	        sort(a, low, i - 1); // �Ե��ӱ���еݹ�����
	        sort(a, i + 1, hight); // �Ը��ӱ���еݹ�����

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
