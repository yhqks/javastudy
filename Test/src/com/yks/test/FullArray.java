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
	//����һ���������ȫ���� ��������н�� ������
	public static void set(int[] array,int start) {
		
		//�������startΪ��������ʱ�޷�����  ��ʱ������Ϊһ�����
		if(start==array.length-1) {
			for(int i=0;i<=9;i++) {
		    	 System.out.print(array[i]);
		     }
			System.out.println();
			//������1
			count++;
		
		}
		else {
			
			for(int i=start;i<=9;i++) {
				//���������������ʼ���ֺ͵�i��
				swap(array,start,i);
				//�������������ʼ+1�ݹ�
				set(array,start+1);
				//���������������ʼ���ֺ͵�i��
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
