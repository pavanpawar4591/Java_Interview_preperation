package day2;

/**
 * 26. Remove Duplicates from Sorted Array

Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
 */
import java.util.HashSet;
import java.util.Set;

public class Problem3 {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 3 };
		System.out.println(removeDuplicates(nums));

	}

	public static int removeDuplicates(int[] nums) {

		int i = 0;
		for (int j = i; j < nums.length; j++) {
			if (nums[i] != nums[j]) {
				nums[i + 1] = nums[j];
				i++;
			}
		}
		return i + 1;
	}

	public static int removeDuplicates_brute_force(int[] nums) {

		Set<Integer> myset = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			myset.add(nums[i]);

		}

		int i = 0;
		for (Integer se : myset) {
			nums[i] = se;
			i++;
		}
		return myset.size();
	}

}
