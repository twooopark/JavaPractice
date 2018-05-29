package com.javaex.exception;

public class ArrayExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[] {3, 6, 9};
		try {
		System.out.println(intArray[3]);
		}catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace(); (error: 3)
			System.out.println("error: "+e.getMessage());

			//어떤 요소에서 에러가 나오는지...(error: [Ljava.lang.StackTraceElement;@7852e922)
			System.out.println("error: "+e.getStackTrace());
		}
	}

}
