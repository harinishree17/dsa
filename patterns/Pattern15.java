// Example:
// Input: ‘N’ = 3

// Output:

// A B C
// A B
// A


public class Pattern15 {
    public static void nLetterTriangle(int n) {
        for(int i = 0; i< n; i++){
            for(int j = 0; j<n-i; j++){
                System.out.print((char)(65+j)+ " ");
            }
            System.out.println();
        }
    }
}