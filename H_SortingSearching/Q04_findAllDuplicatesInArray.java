package H_SortingSearching;

import java.util.ArrayList;
import java.util.List;

// LEETCODE QUESTION 
// https://leetcode.com/problems/find-all-duplicates-in-an-array/

public class Q04_findAllDuplicatesInArray {
    
     public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<nums.length; i++){
            while(nums[i] != nums[nums[i]-1]){
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }

        }
        for(int i = 0; i<nums.length; i++){
            if(i != nums[i]-1){
                list.add(nums[i]);
            }
        }
        return list;
    }
}
