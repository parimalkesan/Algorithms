public class LobbNumber
{
	  
    // Returns value of Binomial 
    // Coefficient C(n, k) 
    static int binomialCoeff(int n, int k) 
    { 
        int C[][] = new int[n + 1][k + 1]; 
       
        // Calculate value of Binomial  
        // Coefficient in bottom up manner 
        for (int i = 0; i <= n; i++) { 
            for (int j = 0; j <= Math.min(i, k); 
                                        j++) { 
                // Base Cases 
                if (j == 0 || j == i) 
                    C[i][j] = 1; 
       
                // Calculate value using  
                // previously stored values 
                else
                    C[i][j] = C[i - 1][j - 1] + 
                              C[i - 1][j]; 
            } 
        } 
       
        return C[n][k]; 
    } 
      
    // Return the Lm, n Lobb Number. 
    static int lobb(int n, int m) 
    { 
        return ((2 * m + 1) * binomialCoeff(2 * n, m + n)) /  
                                             (m + n + 1); 
    } 
      
    /* Driver program to test above function */
    public static void main(String[] args)  
    { 
        int n = 5, m = 3; 
        System.out.println(lobb(n, m)); 
          
    } 

}
