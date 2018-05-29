package com.javaex.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FilesStreamEx {
	static String dirName = "D:\\javastudy\\files\\files\\";
	static String source = dirName + "img.jpg";
	static String target = dirName + "img_copy.jpg";
	public static void main(String args[]) {

		try {
			InputStream is = new FileInputStream(source);
			OutputStream os = new FileOutputStream(target);
			
			int data = 0;
			
			while( (data = is.read()) != -1 ) {
				os.write(data);
			}
			
			os.close();
			is.close();
			System.out.println("File Copy!!!!");
				
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException!!!!");
		} catch (IOException e) {
			System.out.println("IOException!!!!");
		}
		
	
			
	
	}

}
