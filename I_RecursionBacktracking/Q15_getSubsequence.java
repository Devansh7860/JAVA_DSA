package I_RecursionBacktracking;

import java.util.ArrayList;

public class Q15_getSubsequence {
    // Print all the subsequences of a string 
    
    public static ArrayList<String> getSubsequence(String str){

        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        ArrayList<String> rres = getSubsequence(str.substring(1));
        ArrayList<String> mres = new ArrayList<>();
        for(String s : rres){
            mres.add("" + s);
        }
        for(String s : rres){
            mres.add(ch + s);
        }
        return mres;

    }
    public static void main(String[] args) {
        
        String str = "abcd";
        ArrayList<String> arl = getSubsequence(str);

        for(String s : arl){
            System.out.println(s);
        }

    }
}
