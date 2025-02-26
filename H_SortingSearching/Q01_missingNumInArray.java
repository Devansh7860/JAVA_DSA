package H_SortingSearching;

// LEETCODE QUESTION
// https://leetcode.com/problems/missing-number

public class Q01_missingNumInArray {
    // array contains num from [0,n]
    // find the missing number (if no missing number then print arr.length)

    public static int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i ) {
                if(nums[i] == nums.length){
                    break;
                }
                
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(i!=nums[i]){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
        
    }
}
