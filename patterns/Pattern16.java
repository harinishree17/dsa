// Example:
// Input: ‘N’ = 3

// Output:
// A
// B B
// C C C


public class Pattern16 {
    public static void alphaRamp(int n) {
        for(int i = 0; i< n; i++){
            for(int j = 0; j<i+1; j++){
                System.out.print((char)(65+i)+ " ");
            }
            System.out.println();
        }
    }
}