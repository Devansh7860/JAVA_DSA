package A_JavaBasics;
import java.util.*;
public class functions {
    public static int factorial(int num){ // if the function doesn't return anything, we can write void.
        int fact = 1;
        if(num < 0){
            System.out.println("Can't calculate factorial for negative numbers");
        } 
        else{
            for(int i = num; i>=1; i--){
                fact = fact*i;
            }
            System.out.println(fact);
            
        }
        return fact;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        factorial(num);
        sc.close();
    }
}
