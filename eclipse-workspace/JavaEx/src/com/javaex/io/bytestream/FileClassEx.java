package com.javaex.io.bytestream;

import java.io.*;

public class FileClassEx {
	static String dirName = "D:\\javastudy\\files\\files\\";
	public static void main(String args[]) {
		File root = new File(dirName);
		System.out.println(dirName+" : "+root.exists());
		
		printInfo(root);
		
		File file = new File(dirName + "myfile.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
				
			}catch(IOException e){
				System.out.println("파일으 만들지 못했어요.");
				
			}
		}
		
		printInfo(root);
		
		file.delete();
		printInfo(root);
		
	}
	
	static void printInfo(File f) {
		System.out.println("========================");
		if(f.isDirectory()) {
			System.out.println("Directory: "+ f.getName());
			File[] files = f.listFiles();
			for (File file:files) {
				System.out.println(file.isDirectory()?"d":"f");
				System.out.println(file.getName());
			}
		}else {
			System.out.println("File : "+ f.getName());
		}
		System.out.println("========================");
	}
}
