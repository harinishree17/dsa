// Example:
// Input: ‘N’ = 3

// Output:
//     A
//   A B A
// A B C B A


public class Pattern17 {
    public static void alphaHill(int n) {
        for(int i = 0; i< n; i++){
            System.out.print(" ".repeat(2*(n-i-1)));
            for(int j = 0; j<i+1; j++){
                System.out.print((char)(65+j)+ " ");
            }
            for(int j = i; j>0; j--){
                System.out.print((char)(65+j-1)+ " ");
            }
            System.out.print(" ".repeat(2*(n-i-1)));
            System.out.println();
        }
    }
}