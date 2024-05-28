package day2;

import java.util.HashMap;
import java.util.Map;

public class Problem5 {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 2 };
		System.out.println("better solution :" + singleNumber_better(nums));
	}

	public int singleNumber_BF(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int found = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					found++;
				}
			}
			if (found == 1) {
				return nums[i];
			}
		}

		return -1;
	}

	public static int singleNumber_better(int[] nums) {
		Map<Integer, Integer> mymap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int value = mymap.getOrDefault(nums[i], 0);
			mymap.put(nums[i], value + 1);

		}

		for (Map.Entry<Integer, Integer> it : mymap.entrySet()) {
			if (it.getValue() == 1) {
				return it.getKey();
			}
		}

		return 0;

	}

	public int singleNumber(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i != j && nums[i] == nums[j]) {
					break;
				}
				if (j == nums.length - 1) {
					return nums[i];
				}
			}
		}
		return 0;
	}
}
