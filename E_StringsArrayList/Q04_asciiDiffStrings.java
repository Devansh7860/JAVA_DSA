package E_StringsArrayList;
import java.util.*;
public class Q04_asciiDiffStrings {
    // acdge

    public static String asciiDiffString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for(int i = 1; i<str.length(); i++){
            int asciiDiff = str.charAt(i) - str.charAt(i-1);
            sb.append(asciiDiff);
            sb.append(str.charAt(i));
        }

        return sb.toString();
        
    }
    

    public static void main(String[] args) {
         
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();

        System.out.println(asciiDiffString(str));
    }
}
