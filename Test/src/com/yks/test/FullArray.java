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
	
	public static void set(int[] array,int start) {
		if(start==array.length-1) {
			for(int i=0;i<=9;i++) {
		    	 System.out.print(array[i]);
		     }
			System.out.println();
			count++;
		
		}
		else {
			for(int i=start;i<=9;i++) {
				swap(array,start,i);
				set(array,start+1);
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
