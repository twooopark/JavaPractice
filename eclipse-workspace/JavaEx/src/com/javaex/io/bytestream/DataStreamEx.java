package com.javaex.io.bytestream;

import java.io.*;

public class DataStreamEx {
	static String dirName = "D:\\javastudy\\files\\files\\";
	static String filename = dirName + "primitives.dat";
	public static void main (String args[]) {
		
		try {
			FileOutputStream fos = new FileOutputStream(filename);
			DataOutputStream dos = new DataOutputStream(fos);

			dos.writeUTF("홍길동");
			//dos.writeChars("박두리");
			dos.writeBoolean(true);
			dos.writeLong(25);
			dos.writeFloat(3.3f);
		
			dos.close();
			
			InputStream fis = new FileInputStream(filename);
			DataInputStream dis = new DataInputStream(fis);
			
			for(int i=0; i<2; i++) {
				System.out.println(dis.readUTF());
				//System.out.println(dis.readUTF());
				System.out.println(dis.readBoolean());
				System.out.println(dis.readLong());
				System.out.println(dis.readFloat());
			}
			

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException!!!!");
		} catch (IOException e) {
			System.out.println("IOException!!!!");
		}
	}
	
}
