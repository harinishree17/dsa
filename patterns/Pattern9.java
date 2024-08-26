// Example:
// Input: ‘N’ = 3

// Output:

//   *
//  ***
// *****
// *****
//  ***
//   *



public class Pattern9 {
    public static void nStarDiamond(int n) {
        for(int i = 0; i<n; i++){
            System.out.println(" ".repeat(n-1-i)+"*".repeat(2*i + 1)+" ".repeat(n-i-1));
        }
        for(int i = 0; i<n; i++){
            System.out.println(" ".repeat(i)+"*".repeat(2*n - 1 - 2*i)+" ".repeat(i));
        }
    }
}