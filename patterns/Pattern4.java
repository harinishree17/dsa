// Example:
// Input: ‘N’ = 3

// Output:
// 1
// 2 2
// 3 3 3


public class Pattern4 {
    public static void nTriangle(int n) {
        for(int i = 0; i<n; i++){
            System.out.println((String.valueOf(i+1)+" ").repeat(i+1));
        }
    }
}