package H_SortingSearching;

// LEETCODE QUESTION
// https://leetcode.com/problems/set-mismatch/

public class Q05_setMismatch {
    // nums contains numbers from 1 to n. One number appears twice and replaces another number. 
    // Find the number appeared twice and the number removed.
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        for(int i = 0; i<nums.length; i++){
            while(nums[i] != nums[nums[i]-1]){
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(i != nums[i]-1){
                arr[0] = nums[i];
                arr[1] = i+1;
                break;
            }
        }
        return arr;
    }
}
