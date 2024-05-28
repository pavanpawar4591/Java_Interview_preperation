package day2;

import java.util.HashMap;
import java.util.Map;

public class Problem7 {
	/**
	 * 1. Two Sum
	 * 
	 * Given an array of integers nums and an integer target, return indices of the
	 * two numbers such that they add up to target.
	 * 
	 * You may assume that each input would have exactly one solution, and you may
	 * not use the same element twice.
	 * 
	 * You can return the answer in any order.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation: Because
	 * nums[0] + nums[1] == 9, we return [0, 1]. Example 2:
	 * 
	 * Input: nums = [3,2,4], target = 6 Output: [1,2] Example 3:
	 * 
	 * Input: nums = [3,3], target = 6 Output: [0,1]
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] result = twoSum_broutforce(nums, target);
		System.out.println("Expected [0,1] actual " + result[0] + ", " + result[1]);

		// best approach
		result = twoSum(nums, target);

		System.out.println("beasr Expected [0,1] actual " + result[0] + ", " + result[1]);
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> hash = new HashMap<>();
		int[] ans = { -1, -1 };
		for (int i = 0; i < nums.length; i++) {
			int a = nums[i];
			int more = target - a;
			if (hash.containsKey(more)) {
				ans[0] = hash.get(more);
				ans[1] = i;
				return ans;
			}
			hash.put(nums[i], i);
		}

		return null;
	}

	public static int[] twoSum_broutforce(int[] nums, int target) {
		int[] result = { -1, -1 };

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
				}

			}
		}

		return result;
	}

}
