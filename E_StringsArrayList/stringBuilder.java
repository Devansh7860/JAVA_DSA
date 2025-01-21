package E_StringsArrayList;

public class stringBuilder {
    // they have better performance than strings
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb.charAt(0)); // to print a character at a given index

        sb.setCharAt(0, 'f'); // to set a character at a given index
        System.out.println(sb);

        sb.insert(0, "buf"); // to insert a character/string at an index
        sb.append('w'); // to insert a character/string in the end.
        System.out.println(sb);

        sb.delete(0, 4); // to delete a substring from 0 index till 3 index(4 excluded)

        sb.insert(0, 'y');
        System.out.println(sb);
        sb.deleteCharAt(0); // to delete a character at a given index.
        System.out.println(sb);


        // concatenation in string vs string builder

        String str = "Devansh";
        StringBuilder sbr = new StringBuilder("Devansh");
        
        str += "Bansal"; 
        // we know that strings are immutable so here we can't change the original value "Devansh"
        // so what happens is that a new string object is created where it first coppies the content of "Devansh" character by character
        // then it adds content of "Bansal" character by character.
        System.out.println(str);

        // now what happens with stringbuilder is that it adds "Bansal" in the same string object. 
        // it doesn't create a new string where it first coppies original value then adds new.
        sbr.append("Bansal");
        System.out.println(sbr);


        
    }
}
