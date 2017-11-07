package com.bayviewglen.problemset;

public class ContiguousSubsequence {

	public static void main(String[] args) {
		int[] nums = { 10, 9, 43, -54, 65, -87, -90, 23 };

		int[] output = new int[nums.length];
		String[] str = new String[nums.length];

		int max = 0;
		output[0] = nums[0];
		str[0] = nums[0] + "";

		for (int i = 1; i < nums.length; i++) {
			if (output[i - 1] + nums[i] > nums[i]) {
				output[i] = output[i - 1] + nums[i];
				str[i] = str[i - 1] + ", " + nums[i];

				if (output[i] > output[max]) {
					max = i;
				}

			} else {
				output[i] = nums[i];
				str[i] = nums[i] + "";
				
				if (output[i] > output[max]) {
					max = i;
				}
			}

		}

		System.out.println("The larges sum is " + output[max]);
		System.out.println("It is a chieved with the subsequence " + str[max]);
	}

}
