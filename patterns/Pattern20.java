// Example:
// Input: ‘N’ = 3

// Output:
// *         *
// * *     * *
// * * * * * *
// * *     * *
// *         *


public class Pattern20 {
    public static void symmetry(int n) {
        for(int i = 0; i<n*2-1; i++){
            System.out.println("* ".repeat((i+1)-(2*((i/n)*((i+1)%n))))+" ".repeat(Math.abs(n-i-1))+"* ".repeat((i+1)-(2*((i/n)*((i+1)%n)))));
        }
    }
}