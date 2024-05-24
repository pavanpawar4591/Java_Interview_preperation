package day2;


/***
 * 268. Missing Number
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

 

Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
 */
public class Problem4 {

	public static void main(String[] args) {
		int[] nums = { 0, 1 };
		System.out.println("missing no :" + missingNumber_brute_force(nums));

		System.out.println("missing no better approach :" + missingNumber(nums));

	}

	public static int missingNumber(int[] nums) {
		/**
		 * Sum of first N numbers(S1) = (N*(N+1))/2 Sum of all array elements(S2) = i =
		 * 0n-2a[i] The missing number = S1-S2
		 * 
		 * 
		 */
		int n = nums.length;
		int totalsum = ((n * (n + 1)) / 2);
		System.out.println("0 to N number sum " + totalsum);
		int arraysum = 0;
		for (int i = 0; i < n; i++) {
			arraysum = arraysum + nums[i];
		}
		
		
		return totalsum- arraysum;
	}

	public static int missingNumber_brute_force(int[] nums) {

		int n = nums.length;
		for (int j = 0; j <= n; j++) {
			int found = 0;
			for (int i = 0; i < n; i++) {
				if (nums[i] == j) {
					found = 1;
					break;
				}
			}
			if (found == 0) {
				return j;
			}
		}
		return -1;
	}

}
