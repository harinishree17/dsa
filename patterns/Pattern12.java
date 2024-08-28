// Example:
// Input: ‘N’ = 3

// Output:
// 1         1
// 1 2     2 1
// 1 2 3 3 2 1


public class Pattern12 {
    public static void numberCrown(int n) {
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i+1; j++){
                System.out.print(j+1+" ");
            }
            System.out.print(" ".repeat(2*(n-i)));
            for(int j = i+1; j>0; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}