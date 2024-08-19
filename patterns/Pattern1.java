// Example:
// Input: ‘N’ = 3

// Output:
// * * *
// * * *
// * * *


public class Pattern1{
    public static void nForest(int n) {
        for(int i = 0; i<n; i++){
            System.out.println("* ".repeat(n));
        }
    }
}

//Time Complexity : O(n)
//Space Complexity : O(1)