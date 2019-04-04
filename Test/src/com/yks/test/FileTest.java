package com.yks.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {
	
	static int count=0;
	static  int fild=0;
	static  int fil=0;
	
	//输出某文件下所有的文件名 文件夹数 文件数  和总数
	//fild 文件夹数
	//fil  文件数
	//count 总数
//	public static void  findfile(File file) {
//		File[]  f=file.listFiles();
//	
//		for (File file2 : f) {
//			if(file2.isDirectory()) {
//				System.out.println(file2.getName());
//				count++;
//				fild++;
//				findfile(file2);
//			}
//			else {}
//			System.out.println(file2.getName());
//			count++;
//			fil++;
//		}
//		
//	}
	public static void main(String[] args) {
		
		File file = new File("d:/text.txt");
	

		
//		findfile(file);
//		System.out.println(count);
//		System.out.println(fild);
//		System.out.println(fil);
		File file1 = new File("d:/text2.txt");
		//try 新用法 在括号里面的资源可以自动关闭
		try(
				FileInputStream in =new FileInputStream(file);
				FileOutputStream out = new FileOutputStream(file1,true);
				)
		
		{
////
//			if (!file.exists())
//				file.createNewFile();
//
//			String str1 = "我是小南瓜";
//			byte[] b = str1.getBytes();
//
//			String str = new String(b);
//			FileWriter fw = new FileWriter(file);

			
			//文件复制 边读边写 
			int ch=-1;
			 while((ch=in.read())!=-1)
				 out.write(ch);
//
////			fw.write(str, 0, str.length());
//			in.write(b, 0, b.length);
////			fw.close();
////			in.close();
//
//			FileReader fr=new FileReader(file);
//			int ch;
//			StringBuffer str11 = new StringBuffer();
//			 while( (ch=fr.read())!=-1) {
//				 System.out.print((char)ch);
//				 str11.append((char)ch);
//			 }
//			
//			System.out.println(str11);
//			File f1 = new File("d:/", "text2.txt");
//			if (!f1.exists())
//				f1.createNewFile();
//        
//			FileOutputStream in1 = new FileOutputStream(f1);
//			String st=str11.toString();
//			in1.write(str1.getBytes(),0,str1.getBytes().length);
//			in1.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		}
	}
}

