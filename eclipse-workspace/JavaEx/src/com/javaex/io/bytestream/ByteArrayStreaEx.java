package com.javaex.io.bytestream;

import java.io.*;
import java.util.*;

public class ByteArrayStreaEx {

	public static void main(String[] args) {
		byte[] inSrc = { 0,1 ,2,3,4,5,6,7,8,9};
		byte[] outDes = null;
		
		
		System.out.println(Arrays.toString(inSrc));
		
		
		InputStream bis = new ByteArrayInputStream(inSrc);
		OutputStream bos = new ByteArrayOutputStream();
		
		try {
			int data=0;
			while( (data=bis.read()) !=-1) {
				System.out.println(data);
				bos.write(data);
			}
			
			outDes = ((ByteArrayOutputStream)bos).toByteArray();
			System.out.println(Arrays.toString(outDes));
			
			bos.close();
			bis.close();
		}catch(IOException e) {
			
		}catch(Exception e) {
			
		}
		
	}

}
