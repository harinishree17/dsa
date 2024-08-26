// Example:
// Input: ‘N’ = 3

// Output:

// *****
//  ***
//   *


public class Pattern8 {
    public static void nStarTriangle(int n) {
        for(int i = 0; i<n; i++){
            System.out.println(" ".repeat(i)+"*".repeat(2*n - 1 - 2*i)+" ".repeat(i));
        }
    }
}