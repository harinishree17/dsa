// Example:
// Input: ‘N’ = 3

// Output:
// * * * * * *
// * *     * *
// *         *
// *         *
// * *     * *
// * * * * * *


public class Pattern19 {
    public static void symmetry(int n) {
        for(int i = 0; i<n; i++){
            System.out.println("* ".repeat(n-i)+" ".repeat(i)+"* ".repeat(n-i));
        }
        for(int i = 0; i<n; i++){
            System.out.println("* ".repeat(i+1)+" ".repeat(2*(n-i-1))+"* ".repeat(i+1));
        }
    }
}