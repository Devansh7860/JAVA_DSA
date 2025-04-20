package I_RecursionBacktracking;

import java.util.ArrayList;

public class Q16_keypadCombinations {
    // Print all the combinations that can be made from a keypad combination
    // Remeber the old mobile phones keypad with 1 = abc , 2 = def , 3 = geh , .....

    // If user inputs 123
    // then it can print total 27 combinations of words with abc,def,geh
    
    static String[] codes = {".;" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz" };

    public static ArrayList<String> keypadCombinations(String str){
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        ArrayList<String> rres = keypadCombinations(str.substring(1));
        ArrayList<String> mres = new ArrayList<>();

        for(int i = 0; i<codes[ch - '0'].length(); i++){
            char cch = codes[ch - '0'].charAt(i);
            for(String s : rres){
                mres.add(cch + s);
            }
        }
        return mres;

    }
    public static void main(String[] args) {

        String str  = "123";
        ArrayList<String> arl = keypadCombinations(str);

        for(String s : arl){
            System.out.println(s);
        }
        
    }
}
