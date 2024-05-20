package tset;

/***
 * Given an array Arr of size N, print the second largest distinct element from an array. If the second largest element doesn't exist then return -1.

Example 1:

Input: 
N = 6
Arr[] = {12, 35, 1, 10, 34, 1}
Output: 34
Explanation: The largest element of the 
array is 35 and the second largest element
is 34.
Example 2:

Input: 
N = 3
Arr[] = {10, 5, 10}
Output: 5
Explanation: The largest element of 
the array is 10 and the second 
largest element is 5.
Your Task:
You don't need to read input or print anything. Your task is to complete the function print2largest() which takes the array of integers arr and n as parameters and returns an integer denoting the answer. If 2nd largest element doesn't exist then return -1.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
2 ≤ N ≤ 105
1 ≤ Arri ≤ 105


 */
public class PrintSecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] input= {1,312,33,22,13,22,2};
		System.out.println(print2largest(input, input.length));

		int [] input1= {1,312,33,22,13,222,2};
		System.out.println(print2largest(input1, input1.length));

	}

	public static int print2largest(int arr[], int n) {
		    int largest = arr[0];
		    int secondlargert = -1;
		    
		      for (int i =1 ;i<n ;i++)
		      {
		          if (largest < arr[i] )
		          {
		           secondlargert = largest;
		           largest = arr[i];
		           
		          } else if (arr[i] > secondlargert && arr[i] != largest)
			   {
				  secondlargert = arr[i];
			   }
		      }
		      return secondlargert;
		    }
}


