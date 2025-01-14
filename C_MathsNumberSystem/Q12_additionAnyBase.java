package C_MathsNumberSystem;

import java.util.Scanner;

public class Q12_additionAnyBase {
    // Any base to any base addition
    // --------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int base = sc.nextInt();
        int finalnum = anyBaseToAnyBaseAddition(num, num2, base);
        System.out.println(finalnum);
        sc.close();
    }

    

    public static int anyBaseToAnyBaseAddition(int num1, int num2, int base) {
        int carry = 0;
        int finalnum = 0;
        int place = 0;

        while (num1 != 0 || num2 != 0 || carry != 0) {
            int rem1 = num1 % 10;
            int rem2 = num2 % 10;
            num1 = num1 / 10;

            num2 = num2 / 10;
            int sum = rem1 + rem2 + carry;

            carry = sum / base;
            sum = sum % base;
            finalnum += sum * (int) Math.pow(10, place);
            place++;

            // if(sum>=base){
            // int dig = sum - base;
            // carry = 1;
            // finalnum += dig*(int)Math.pow(10 , place);
            // place++;
            // }
            // else{
            // carry = 0;
            // finalnum += sum*(int)Math.pow(10,place);
            // place++;
            // }

        }

        return finalnum;

    }
}
