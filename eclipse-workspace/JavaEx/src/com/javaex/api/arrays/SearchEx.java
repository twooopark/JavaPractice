package com.javaex.api.arrays;

import java.util.Arrays;

public class SearchEx {
	public static void main(String[] args) {
		
		//전체 배열에서, key(1118)값이 있는 위치를 찾는다.
		int[] nums = {88888,2,7,14,55,887,116,1118,8849};
		int index = Arrays.binarySearch(nums, 1118);
		System.out.println("6의 index: "+index);//6의 index: 7
		
		String[] str = new String[]{"java", "R", "Python", "C++"};
		
		Arrays.sort(str);// binarySearch는 정렬된 배열에 사용해야함.
		
		int index2 = Arrays.binarySearch(str, "java");
		System.out.println("java의 index: "+index2);
		//? 안되는데?ㅋㅋㅋ 알아보신다고 함. --> 정렬안해서 그랬었음
		
		
		
	}

}
