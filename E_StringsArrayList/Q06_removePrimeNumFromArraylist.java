package E_StringsArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Q06_removePrimeNumFromArraylist {
    // remove all the prime numbers from an array list

    

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no. of elements in the list");
        int n = scn.nextInt();
        ArrayList<Integer> arl = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int num = scn.nextInt();
            arl.add(num);
        }    
        scn.close();

        for(int i = arl.size()-1; i>=0; i--){ // we are running loop from the end because lets say we find 
                                              // a prime num at 1st index, then we remove that value after which 
                                              // indexes of rest of the elements will get changed. so the next element's index will now become 1 but the iterator value will now become 2 so it will not check the new element at index 1 now.
            if(i<2){                          // but if we run loop from end of the list, then even if an element is removed , the index of rest of the elements will remain unchanged.
                continue;
            }
            boolean flag = true;
            for(int j = 2; j*j <= arl.get(i); j++){
                if(arl.get(i)%j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                arl.remove(i);
            }
            
        }

        for(int val : arl){
            System.out.println(val);
        }








    }
}
