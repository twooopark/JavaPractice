package com.javaex.io.bytestream;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharStreamEx {
	static String dirName = "D:\\javastudy\\files\\files\\";
	static String filename = dirName + "char.txt";
	
	public static void main(String args[]) {
		try {
			Writer fw = new FileWriter(filename);
			fw.write("Bit Com\n\r");
			fw.write("Java Programming\n\r");
			fw.write("2018.05");
			fw.flush();
			fw.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException!!!!");
		} catch (IOException e) {
			System.out.println("IOException!!!!");
		}
	}
		
}
