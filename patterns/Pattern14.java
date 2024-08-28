// Example:
// Input: ‘N’ = 3

// Output:
// A
// A B
// A B C


public class Pattern14 {
    public static void nLetterTriangle(int n) {
        for(int i = 0; i< n; i++){
            for(int j = 0; j<i+1; j++){
                System.out.print((char)(65+j)+ " ");
            }
            System.out.println();
        }
    }
}
