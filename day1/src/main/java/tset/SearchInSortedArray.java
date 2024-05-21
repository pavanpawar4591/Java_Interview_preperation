package tset;

public class SearchInSortedArray {

	public static void main(String[] args) {
	 
		int []arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(searchInSorted(arr, arr.length, 4));
		System.out.println(searchInSorted(arr, arr.length, 99));

	}
	
    static int searchInSorted(int arr[], int N, int K)
    {
        int found =-1;
        // Your code here
        for (int i =0;i<N;i++)
        {
            if (K == arr[i])
            {
            
               found = 1;
            break;
            }
        }
        return found ;
    }

}
