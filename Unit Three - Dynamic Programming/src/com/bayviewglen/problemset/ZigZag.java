package com.bayviewglen.problemset;

public class ZigZag {

	public static void main(String[] args) {

		int[] nums = { 0, 1, 7, 7, 4, 4, 9, 5, 6, 6, 7, 1 };

		int[] increasing = new int[nums.length];
		int[] decreasing = new int[nums.length];
		
		increasing[0] = 1;
		decreasing[0] = 1;
		
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i - 1]) {
				increasing[i] = decreasing[i - 1] + 1;
				decreasing[i] = decreasing[i - 1];
			} else if (nums[i] == nums[i - 1]) {
				increasing[i] = increasing[i - 1];
				decreasing[i] = decreasing[i - 1];
			} else {
				decreasing[i] = increasing[i - 1] + 1;
				increasing[i] = increasing[i - 1];
			}
		}
		System.out.println(Math.max(increasing[nums.length-1],decreasing[nums.length-1])
				+ " is the length of the longest subsequence.");
		}
}