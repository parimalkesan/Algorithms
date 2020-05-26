//Given an array of n elements. Our task is to write a program to rearrange the array such that elements at even positions are greater 
//than all elements before it and elements at odd positions are less than all elements before it.

//Time Complexity:O(nlogn),Auxiliary Space:O(n)
package ArrayRearrangement;

import java.util.Arrays;

public class ArraySpecificEvenOddIndexArrangement 
{
	// function to rearrange the array 
    public static void rearrangeArr(int arr[], 
                                        int n) 
    { 
        // total even positions 
        int evenPos = n / 2; 
  
        // total odd positions 
        int oddPos = n - evenPos; 
  
        int[] tempArr = new int [n]; 
  
        // copy original array in an 
        // auxiliary array 
        for (int i = 0; i < n; i++) 
            tempArr[i] = arr[i]; 
  
        // sort the auxiliary array 
        Arrays.sort(tempArr); 
  
        int j = oddPos - 1; 
  
        // fill up odd position in  
        // original array 
        for (int i = 0; i < n; i += 2) { 
            arr[i] = tempArr[j]; 
            j--; 
        } 
  
        j = oddPos; 
  
        // fill up even positions in  
        // original array 
        for (int i = 1; i < n; i += 2) { 
            arr[i] = tempArr[j]; 
            j++; 
        } 
  
        // display array 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    } 
      
    // Driver function  
    public static void main(String argc[]){ 
        int[] arr = new int []{ 1, 2, 3, 4, 5, 
                                        6, 7 }; 
        int size = 7; 
        rearrangeArr(arr, size); 
          
    } 

}
