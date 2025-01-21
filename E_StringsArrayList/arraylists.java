package E_StringsArrayList;

import java.util.ArrayList;

public class arraylists {
    // array size can be changed 
    public static void main(String[] args) {

        // Declaration
        ArrayList<Integer> arl = new ArrayList<>();

        // ArrayLists methods
        arl.add(10); // inserts 10 at the end of the list
        arl.add(20);
        System.out.println(arl + " , " + arl.size());
        arl.add(0 , 50); // inserts 50 at index 1 without changing any element
        arl.add(2, 40);
        System.out.println(arl + " , " + arl.size());

        System.out.println(arl.get(1));
        System.out.println(arl.get(2));
        arl.set(0, 10); // replaces the value at index 0 with 10.
        arl.set(1, 20); // replaces the value at index 1 with 20.
        System.out.println(arl + " , " + arl.size());
        arl.remove(3); // removes value at index 3.
        System.out.println(arl + " , " + arl.size());

        for(int val: arl){ // another way of printing elements of an array
            System.out.println(val);
        }

    }
    
}
