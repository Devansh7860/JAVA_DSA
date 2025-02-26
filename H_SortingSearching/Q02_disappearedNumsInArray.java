package H_SortingSearching;

import java.util.ArrayList;
import java.util.List;

// LEETCODE QUESTION

public class Q02_disappearedNumsInArray {
    // we have to find all the numbers not present in the array 
    // array has n numbers each num is in range of 1 to n. some num may be duplicate
    // Input: nums = [4,3,2,7,8,2,3,1]
    // Output: [5,6]

    // APPROACH?
    // previously our approach was to check until the value at current index is the correct value or not.
    // now our approach is to check until the value at current index is present at its correct index or not.
    // this approach handles duplicates value correctly
    // sorted nums through this approach = [1, 2, 3, 4, 3, 2, 7, 8];
    // now we can easily check which all values are not present.

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != nums[nums[i]-1] ) {                
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }
        }

        for(int i = 0; i<nums.length; i++){
            if(i != nums[i]-1){
                list.add(i+1);
            }
        }
        return list;

    }

    public static void main(String[] args) {
        int[] nums = {2,2};
        System.out.println(findDisappearedNumbers(nums));

    }


}
