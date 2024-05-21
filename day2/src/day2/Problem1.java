package day2;


/*
 * 
 * 
 * 
 Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
 */
public class Problem1 {

	public static void main(String[] args) {
		System.out.println("day2 question 1");
		int [] nums = {1,0,1,1,1,0,0};
		System.out.println(findMaxConsecutiveOnes(nums));
		
		 int [] nums2 = {1,0,1,0,1,0,0,1,1};
		System.out.println(findMaxConsecutiveOnes(nums2));

	}
	
	  public static int findMaxConsecutiveOnes(int[] nums) {
		     int count =0;
		     int max =0;
		     for(int i =0 ;i<nums.length;i++) 
		     {
		            if(nums[i]==1)
		            {
		                count++;
		            }else{
		                count = 0;
		            }
		            
		           max = Math.max(max,count); 

		     }  
		     

		     
		     return max;
		    }

}
