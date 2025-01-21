package E_StringsArrayList;
import java.util.*;;

public class Q01_palindromicSubstrings {
    // print all the palindromic substrings of a string

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i<=j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        scn.close();
        

        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j<=s.length(); j++){
                String substr = s.substring(i, j);
                if(isPalindrome(substr)){
                    System.out.println(substr);
                }
            }
        }
    }
    
}
