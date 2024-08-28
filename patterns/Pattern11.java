// Example:
// Input: ‘N’ = 3

// Output:
// 1
// 0 1
// 1 0 1


public class Pattern11 {
    public static void nBinaryTriangle(int n) {
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i+1; j++){
                if(i-j == 0 || (i-j)%2 == 0){
                    System.out.print(1+ " ");
                }
                else{
                    System.out.print(0+ " ");
                }
            }
            System.out.println();
        }
    }
}
