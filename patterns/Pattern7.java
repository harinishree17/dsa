// Input: ‘N’ = 3

// Output:

//   *
//  ***
// *****


public class Pattern7 {
    public static void nStarTriangle(int n) {
        for(int i = 0; i<n; i++){
            System.out.println(" ".repeat(n-i-1)+"*".repeat(2*i+1)+" ".repeat(n-i-1));
        }
    }
}