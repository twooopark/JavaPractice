package com.javaex.api.arrays;

import java.util.Arrays;

public class SortEx {
	public static void main(String args[]) {
		int[] nums = {88888,2,7,14,55,887,116,1118,8849};
		for(int a:nums)
			System.out.print(a+" ");
		System.out.print("\n");
		Arrays.sort(nums);
		for(int a:nums)
			System.out.print(a+" ");
		System.out.print("\n");
		
		
		int[] nums2 = {88888,2,7,14,55,887,116,1118,8849};
		System.out.println(Arrays.toString(nums2));
		Arrays.sort(nums2);
		System.out.println(Arrays.toString(nums2));
		
	}
}
