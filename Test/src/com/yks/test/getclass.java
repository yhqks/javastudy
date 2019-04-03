package com.yks.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class getclass {

	public static void main(String[] args) {
		try {
			Class presonClass = Class.forName("com.yks.test.Preson");
			System.out.println("**********************所有公有构造方法*********************************");
			Constructor[] conArray = presonClass.getConstructors();
			for (Constructor c : conArray) {
				System.out.println(c);
			}
			System.out.println("**********************所有构造方法*********************************");
			conArray = presonClass.getDeclaredConstructors();

			for (Constructor c : conArray) {
				System.out.println(c);
			}

			System.out.println("*****************获取公有、无参的构造方法*******************************");
			Constructor con = presonClass.getConstructor(null);
			System.out.println("con =" + con);

			Object obj = con.newInstance();
			System.out.println("******************获取私有构造方法，并调用*******************************");
			con = presonClass.getDeclaredConstructor(String.class);
			System.out.println(con);
			// 调用构造方法
			con.setAccessible(true);// 暴力访问(忽略掉访问修饰符)
			obj = con.newInstance("男");
			System.out.println(obj);

			System.out.println("************获取所有公有的字段********************");

			Field[] f = presonClass.getFields();

			for (Field field : f) {
				System.out.println(field);
			}
			f = presonClass.getDeclaredFields();

			for (Field field : f) {
				System.out.println(field);
			}
			System.out.println("************获取所有的字段********************");
			Field f1=presonClass.getDeclaredField("name");
			f1.setAccessible(true);
			System.out.println(f1);
			
			System.out.println("************调用所有的字段********************");
               Object  obj1=presonClass.getConstructor().newInstance();
               f1.set(obj,"男");
               System.out.println(obj);
               
               System.out.println("***************获取所有的”公有“方法*******************");  
               presonClass.getMethods();  
               Method[] methodArray = presonClass.getMethods();  
               for(Method m : methodArray){  
                   System.out.println(m);  
               }  
               System.out.println("***************获取指定的”公有“方法并调用*******************");  
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
			System.out.println("无公有字段");
		}
	}
}
