// Example:
// Input: ‘N’ = 4

// Output:

// 4444444
// 4333334
// 4322234
// 4321234
// 4322234
// 4333334
// 4444444


public class Pattern22 {
    public static void getNumberPattern(int n) {
        for(int i = 0; i<n*2-1; i++){
            for(int j = 0; j<n*2-1; j++){
                System.out.print(n-Math.min(Math.min(i,j),Math.min(2*n-i-2, 2*n-j-2)));
            }
            System.out.println();
        }
    }
}