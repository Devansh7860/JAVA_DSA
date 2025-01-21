package E_StringsArrayList;


public class strings {

    // interning = strings are created in the string pool inside heap memory where it checks if the string value is already present in the pool, then the variable points to the same memory location rather than creating a new one. This saves memory
    // but if we create string using new keyword, then it creates new shell object outside string pool and doesn't point to the same memory location even if the string value is already present in the pool.
    // references of strings are mutable , instances are immutable
    // means if we change the value of a string it will point to a new memory location now of the new value
    // the original value can't be changed and it will be cleared by the garbage collector
    
    public static void main(String[] args) {
        // way of defining a string
        String str1 = "Devansh";
        String str2 = new String("Bansal");
        String str3 = "abc,def,ghi,jkl mno";

        // strings functions

        System.out.println(str1.length());
        System.out.println(str2.charAt(1));
        System.out.println(str1.substring(0,3)); // does not print the last index value

        String[] parts = str3.split(",");
        for(int i = 0; i<parts.length; i++){
            System.out.println(parts[i]);
        }

        // all substrings of a string

        for(int i = 0; i<str1.length(); i++){
            for(int j = i+1; j<=str1.length(); j++){
                System.out.println(str1.substring(i, j));
            }
        }

        // string concatenation 

        System.out.println(str1 + ' ' + str2 ); // Devansh Bansal
        System.out.println(10 + 20 + str1); // 30Devansh  // evaluates from left to right first add 10 and 20 like integers then their result is converted into string and concatenated with Devansh.
        System.out.println(str1 + 10 + 20); // Devansh1020 // evaluates from left to right first convert 10 into string then concat with str1 then convert 20 into string then concat it

        // string comparison
        // == checks the memory location only whether they point to the same shell object or not.
        // equals checks the actual string value 

        String str4 = "Devansh";
        String str5 = "Bansal";
        System.out.println(str1 == str4); // true
        System.out.println(str2 == str5); // false
        System.out.println(str2.equals(str5)); // true


    }
}
