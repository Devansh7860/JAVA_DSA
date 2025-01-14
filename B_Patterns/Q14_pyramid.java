package B_Patterns;

public class Q14_pyramid {
     // pyramid
    // --------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
       
        int counter = 0;
        int i = 1;
        int j = 1;
        int n = 5;
        for(i=1; i<=n; i++){
            for(j=(n-i); j>=0; j--){
                System.out.print(" ");
            }
            for(j=1; j<=(i+counter); j++){
                System.out.print("*");
            }
            counter++;
            System.out.println();

        }
    }
}
