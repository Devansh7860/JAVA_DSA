package H_SortingSearching;

// LEETCODE QUESTION
// https://leetcode.com/problems/find-the-duplicate-number/

public class Q03_findDuplicatesNum {
    // find the duplicate num 
    // only one num can occur 2 or more times.

    public int findDuplicate(int[] nums) {
        /* for(int i =0; i<nums.length; i++){
            while(nums[i] != nums[nums[i]-1]){
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }

        }
        for(int i = 0; i<nums.length; i++){
            if(i != nums[i]-1){
                return nums[i];
            }
        }
        return -1; */

        // OTHER WAY

        for(int i = 0; i<nums.length; i++){
            while(i != nums[i] - 1){
                if(nums[i] != nums[nums[i]-1]){
                    int temp = nums[nums[i]-1];
                    nums[nums[i]-1] = nums[i];
                    nums[i] = temp;
                }
                else{
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
