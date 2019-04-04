package com.yks.test;



public class FullArray {
	static int count=0;
	public static void main(String[] args) {
      int[] array=new int[10];
     for(int i=0;i<=9;i++) {
    	 array[i]=i; 
     }
     
     set(array,0);
     System.out.println(count);
     
     
 }
	//对于一个数组进行全排序 并输出所有结果 和总数
	public static void set(int[] array,int start) {
		
		//当数组的start为最后的数字时无法交换  此时的数组为一种情况
		if(start==array.length-1) {
			for(int i=0;i<=9;i++) {
		    	 System.out.print(array[i]);
		     }
			System.out.println();
			//总数加1
			count++;
		
		}
		else {
			
			for(int i=start;i<=9;i++) {
				//交换现在数组的起始数字和第i个
				swap(array,start,i);
				//将现在数组的起始+1递归
				set(array,start+1);
				//交换回来数组的起始数字和第i个
				swap(array,i,start);
			
				
			}
			
		}
		
	}
	
	public static void swap(int[] array,int i,int j) {
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
		
	}
}
