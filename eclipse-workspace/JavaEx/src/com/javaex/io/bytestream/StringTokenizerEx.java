package com.javaex.io.bytestream;


import java.io.*;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	static String dirName = "D:\\javastudy\\files\\files\\";
	static String filename = dirName + "thieves.txt";

	public static void main (String args[]) {
		
		try {
			InputStreamReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			
			String thief;
			while( (thief = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(thief);
				while(st.hasMoreTokens()) {
					System.out.print(st.nextToken() + " ");
				}
				System.out.println();
			}			
			br.close();
			fr.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException!!!!");
		}
	}
}
