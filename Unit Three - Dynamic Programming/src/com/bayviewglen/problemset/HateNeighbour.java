package com.bayviewglen.problemset;

public class HateNeighbour {

	public static void main(String[] args) {
		int[] nums = { 10, 2, 3, 18, 70, 90, 100 };
		int[] arr1 = new int[nums.length - 1];
		int[] arr2 = new int[nums.length - 1];

		for (int i = 0; i < 2; i++) {
			arr1[i] = nums[i];
			arr2[i] = nums[nums.length - 1 - i];
		}

		for (int i = 2; i < nums.length - 1; i++) {
			if (nums[i] + arr1[i - 2] > arr1[i - 1]) {
				arr1[i] = nums[i] + arr1[i - 2];
			} else {
				arr1[i] = arr1[i - 1];
			}
			
			if (nums[i] + arr2[i - 2] > arr2[i - 1]) {
				arr2[i] = nums[i] + arr2[i - 2];
			} else {
				arr2[i] = arr2[i - 1];
			}
			
		}

		System.out.println("The maximum donation you can get is " + Math.max(arr1[nums.length - 2], arr2[nums.length - 2]));
		
	}

}
