package E_StringsArrayList;
import java.util.*;

public class strings {
    
    public static void main(String[] args) {
        // way of defining a string
        String str1 = "Devansh";
        String str2 = new String("Bansal");

        // strings functions

        System.out.println(str1.length());
        System.out.println(str2.charAt(1));
        System.out.println(str1.substring(0,3)); // does not print the last index value

        // all substrings of a string

        for(int i = 0; i<str1.length(); i++){
            for(int j = i+1; j<=str1.length(); j++){
                System.out.println(str1.substring(i, j));
            }
        }

        // string concatenation 

        System.out.println(str1 + ' ' + str2 );
        System.out.println(10 + 20 + str1); // 30Devansh 
        System.out.println(str1 + 10 + 20); // Devansh1020 // evaluates from left to right first convert 10 into string then concat with str1 then convert 20 into string then concat it
        
    }
}
