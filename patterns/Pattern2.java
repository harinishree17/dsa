// Example:
// Input:  ‘N’ = 3

// Output:
// *
// * *
// * * *


public class Pattern2 {
    public static void nForest(int n) {
        for(int i = 0; i<n; i++){
            System.out.println("* ".repeat(i+1));
        }
    }
}

//Time Complexity : O(n)
//Space Complexity : O(1)