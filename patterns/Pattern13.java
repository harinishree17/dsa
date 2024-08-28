// Example:
// Input: ‘N’ = 3

// Output:
// 1
// 2 3
// 4 5 6


public class Pattern13 {
    public static void nNumberTriangle(int n) {
        int count = 1;
        for(int i= 0; i<n; i++){
            for(int j = 0; j<i+1; j++){
                System.out.print(count+ " ");
                count++;
            }
            System.out.println();
        }
    }
}