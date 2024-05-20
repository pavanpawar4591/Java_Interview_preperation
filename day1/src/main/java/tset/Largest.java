package tset;

/******
 * Given an array A[] of size n. The task is to find the largest element in it.
 * 
 * Example 1:
 * 
 * Input: n = 5 A[] = {1, 8, 7, 56, 90} Output: 90 Explanation: The largest
 * element of given array is 90.
 */
public class Largest {

	public static void main(String[] args) {
		
		 int[] nums1 = {3, 4, 5, 1, 2};
	        int[] nums2 = {2, 1, 3, 4};
	        int[] nums3 = {1, 2, 3, 4};

	        System.out.println(largest(nums1)); // Output: true
	        System.out.println(largest(nums2)); // Output: false
	        System.out.println(largest(nums3)); // Output: true

	}

	public static int largest(int arr[]) {
		int n = arr.length;
		int large = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] > large) {
				large = arr[i];
			}
		}
		return large;
	}
}
