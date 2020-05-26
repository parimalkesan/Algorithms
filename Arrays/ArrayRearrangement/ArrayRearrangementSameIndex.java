//time comp=O(n)
package ArrayRearrangement;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayRearrangementSameIndex
{
	// Function to rearrange an array 
    // such that arr[i] = i. 
    public static int[] fix(int[] A) 
    { 
        Set<Integer> s = new HashSet<Integer>(); 
  
        // Storing all the values in the HashSet 
        for(int i = 0; i < A.length; i++) 
        { 
           s.add(A[i]); 
        } 
  
        for(int i = 0; i < A.length; i++) 
        { 
           if(s.contains(i)) 
             A[i] = i; 
           else
             A[i] = -1; 
        } 
  
      return A; 
} 
  
    // Driver function. 
    public static void main(String[] args) 
    { 
        int A[] = {-1, -1, 6, 1, 9, 
                    3, 2, -1, 4,-1}; 
                      
        // Function calling 
        System.out.println(Arrays.toString(fix(A))); 
    } 

}
