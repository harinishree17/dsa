// Example:
// Input: ‘N’ = 4

// Output:

// ****
// *  *
// *  *
// ****


public class Pattern21 {
    public static void getStarPattern(int n) {
        if(n>2){
            System.out.println("*".repeat(n));
            for(int i = 0; i<n-2; i++){
                System.out.println("*"+" ".repeat(n-2)+"*");
            }
            System.out.println("*".repeat(n));
        }
        else{
            System.out.println("*".repeat(n));
        }
    }
}