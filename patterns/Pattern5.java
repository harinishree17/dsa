// Example:
// Input: ‘N’ = 3

// Output:
// * * *
// * *
// *


public class Pattern5 {
    public static void seeding(int n) {
        for(int i = 0; i<n; i++){
            System.out.println("* ".repeat(n-i));
        }
    }
}
