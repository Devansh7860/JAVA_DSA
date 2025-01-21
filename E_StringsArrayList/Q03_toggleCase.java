package E_StringsArrayList;
import java.util.*;

public class Q03_toggleCase {
    // convert lowercase characters to upercase
    // upercase to lowercase.

    // a to z = 97 - 112
    // A to Z = 65 - 90
    // System.out.println('z' - 'a')  // 25
    // System.out.println((char)('A' + 'z' - 'a')) // Z

    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder(str);

        for(int i = 0; i<sb.length(); i++){
            if(sb.charAt(i) > 'a' && sb.charAt(i) < 'z'){
                char upc = (char)('A' + sb.charAt(i) - 'a') ;
                sb.setCharAt(i, upc);
            }
            else if(sb.charAt(i) > 'A' && sb.charAt(i) < 'Z'){
                char lwc = (char)('a' + sb.charAt(i) - 'A') ;
                sb.setCharAt(i, lwc);
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();

        System.out.println(toggleCase(str));



    }
}
