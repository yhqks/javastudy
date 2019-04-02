package com.yks.test;

import java.util.Arrays;

public class FastSortANDArray {
	 public static void sort(int a[], int low, int hight) {
	        int i, j, index;
	        if (low > hight) {
	            return;
	        }
	        i = low;
	        j = hight;
	        index = a[i]; // ���ӱ�ĵ�һ����¼����׼
	        while (i < j) { // �ӱ�����˽������м�ɨ��
	            while (i < j && a[j] >= index)
	                j--;
	            if (i < j)
	                swap(a,i,j);// �ñȻ�׼С�ļ�¼�滻��λ��¼
	            while (i < j && a[i] < index)
	                i++;
	            if (i < j) // �ñȻ�׼��ļ�¼�滻��λ��¼
	            	 swap(a,i,j);
	        }
	       // a[i] = index;// ����׼��ֵ�滻�� a[i]
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
