package com.javaex.io.bytestream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

//last-leaf.txt를 한줄씩 읽어들여, leaves, leaf가 포함된 줄을 file로 출력하는 프로그램
public class BufferedCharStreamEx {
	static String dirName = "D:\\javastudy\\files\\files\\";
	static String source = dirName+"last-leaf.txt";
	static String target = dirName+"last-leaf-filtered.txt";
	
	public static void main(String[] args) {
	
		try {
			Reader fr = new FileReader(source);
			Writer fw = new FileWriter(target);

			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
			
			String line = "";//빈 줄인 경우, null 반환
			
			while ((line = br.readLine())!= null) {
				if(line.toLowerCase().contains("leaf") || 
						line.toLowerCase().contains("leaves")) {
					bw.write(line+"\r\n");
				}
			}
			bw.close();
			br.close();
			fw.close();
			fr.close();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException!!!!");
		} catch (IOException e) {
			System.out.println("IOException!!!!");
		}
		
	}

}
