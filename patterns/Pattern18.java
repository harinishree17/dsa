// Example:
// Input: ‘N’ = 3

// Output:
// C
// C B
// C B A


public class Pattern18 {
    public static void alphaTriangle(int n) {
        for(int i = 0; i<n; i++){
            for(int j =0; j<i+1; j++){
                System.out.print((char)(65+n-j-1)+ " ");
            }
            System.out.println();
        }
    }
}