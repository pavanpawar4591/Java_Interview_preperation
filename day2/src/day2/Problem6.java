package day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Problem6 {
	/*
	 * Given two sorted arrays of size n and m respectively, find their union. The
	 * Union of two arrays can be defined as the common and distinct elements in the
	 * two arrays. Return the elements in sorted order.
	 * 
	 * Example 1: Input: n = 5, arr1[] = {1, 2, 3, 4, 5} m = 5, arr2 [] = {1, 2, 3,
	 * 6, 7} Output: 1 2 3 4 5 6 7 Explanation: Distinct elements including both the
	 * arrays are: 1 2 3 4 5 6 7.
	 */
	public static void main(String[] args) {

	}

	// Function to return a list containing the union of the two arrays.
	public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {

		Set<Integer> outputset = new HashSet<>();
		for (int i = 0; i < n; i++) {
			outputset.add(arr1[i]);
		}

		for (int j = 0; j < m; j++) {
			outputset.add(arr2[j]);
		}

		ArrayList<Integer> outputlist = new ArrayList<Integer>();
		for (Integer s : outputset) {
			outputlist.add(s);
		}
		Collections.sort(outputlist);
		return outputlist;
	}
}
