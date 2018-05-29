package com.javaex.problem05;

public class StringUtil {
    
    public static String concatString(String[] strArr){
       
        //메소드 내용작성
    	String res = strArr[0];
    	for(int i=1; i<strArr.length; i++) {
    		res += strArr[i];	
    	}
        return res;
    }

}
