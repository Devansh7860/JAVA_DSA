package E_StringsArrayList;
import java.util.*;

// SOLVED ON LEETCODE
public class Q07_palindromeString2 {
    public static boolean validPalindrome(String s) {
        int delCount = 0;
        return vP(s, delCount);
    }

    public static boolean vP(String s, int delCount) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                if (delCount < 1) {
                    if (s.charAt(i) == s.charAt(j - 1) && s.charAt(i + 1) == s.charAt(j)) {
                        delCount++;
                        boolean flag = vP(s.substring(i, j), delCount);
                        boolean flag2 = vP(s.substring(i + 1, j + 1), delCount);
                        if (flag) {
                            j--;
                        } else if (flag2) {
                            i++;
                        }
                    } else if (s.charAt(i) == s.charAt(j - 1)) {
                        delCount++;
                        j--;
                    } else if (s.charAt(i + 1) == s.charAt(j)) {
                        delCount++;
                        i++;
                    } else {
                        return false;
                    }
                    i++;
                    j--;
                } else {
                    return false;
                }

            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(validPalindrome(s));
        scn.close();
    }

}
