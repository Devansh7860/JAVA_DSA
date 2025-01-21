package E_StringsArrayList;

import java.util.*;

public class Q02_stringCompression {

    // compression 1 => aabbccdaeffff => abcdaef
    // compression 2 => aabbccdaeffff => a2b2c2aef4

    public static String compression1(String str) {
        String s = str.charAt(0) + "";

        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char pre = str.charAt(i - 1);
            if (curr != pre) {
                s += curr;
            }

        }
        return s;
    }

    public static String compression2(String str) {
        String s = str.charAt(0) + "";

        int counter = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char pre = str.charAt(i - 1);
            if (curr == pre) {
                counter++;
            } 
            else {
                if (counter>1) {
                    s += counter;
                    counter = 1;
                }
                s += curr;
            }
        }
        if(counter>1){
            s += counter;
            counter =1;
        }

        return s;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }
}
