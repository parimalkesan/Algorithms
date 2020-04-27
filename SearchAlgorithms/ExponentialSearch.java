//Time Complexity : O(Log n)
//Auxiliary Space : The above implementation of Binary Search is recursive and requires O(Log n) space
package Algorithms;

import java.util.Arrays;

public class ExponentialSearch 
{
	// Returns position of first occurrence of 
    // x in array 
    static int exponentialSearch(int arr[], 
                                 int n, int x) 
    { 
        // If x is present at first location itself 
        if (arr[0] == x) 
            return 0; 
      
        // Find range for binary search by 
        // repeated doubling 
        int i = 1; 
        while (i < n && arr[i] <= x) 
            i = i*2; 
      
        // Call binary search for the found range. 
        return Arrays.binarySearch(arr, i/2,  
                                   Math.min(i, n), x); 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
        int arr[] = {2, 3, 4, 10, 40}; 
        int x = 10; 
        int result = exponentialSearch(arr, arr.length, x); 
          
        System.out.println((result < 0) ?  
                            "Element is not present in array" : 
                            "Element is present at index " +  
                             result); 
    } 

}
