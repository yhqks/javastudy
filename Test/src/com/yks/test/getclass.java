package com.yks.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class getclass {

	public static void main(String[] args) {
		try {
			Class presonClass = Class.forName("com.yks.test.Preson");
			System.out.println("**********************���й��й��췽��*********************************");
			Constructor[] conArray = presonClass.getConstructors();
			for (Constructor c : conArray) {
				System.out.println(c);
			}
			System.out.println("**********************���й��췽��*********************************");
			conArray = presonClass.getDeclaredConstructors();

			for (Constructor c : conArray) {
				System.out.println(c);
			}

			System.out.println("*****************��ȡ���С��޲εĹ��췽��*******************************");
			Constructor con = presonClass.getConstructor(null);
			System.out.println("con =" + con);

			Object obj = con.newInstance();
			System.out.println("******************��ȡ˽�й��췽����������*******************************");
			con = presonClass.getDeclaredConstructor(String.class);
			System.out.println(con);
			// ���ù��췽��
			con.setAccessible(true);// ��������(���Ե��������η�)
			obj = con.newInstance("��");
			System.out.println(obj);

			System.out.println("************��ȡ���й��е��ֶ�********************");

			Field[] f = presonClass.getFields();

			for (Field field : f) {
				System.out.println(field);
			}
			f = presonClass.getDeclaredFields();

			for (Field field : f) {
				System.out.println(field);
			}
			System.out.println("************��ȡ���е��ֶ�********************");
			Field f1=presonClass.getDeclaredField("name");
			f1.setAccessible(true);
			System.out.println(f1);
			
			System.out.println("************�������е��ֶ�********************");
               Object  obj1=presonClass.getConstructor().newInstance();
               f1.set(obj,"��");
               System.out.println(obj);
               
               System.out.println("***************��ȡ���еġ����С�����*******************");  
               presonClass.getMethods();  
               Method[] methodArray = presonClass.getMethods();  
               for(Method m : methodArray){  
                   System.out.println(m);  
               }  
               System.out.println("***************��ȡָ���ġ����С�����������*******************");  
               Method m=presonClass.getMethod("fuck",String.class);
               m.invoke(obj1, "name");
               
               
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			System.out.println("�޹����ֶ�");
		}
	}
}
