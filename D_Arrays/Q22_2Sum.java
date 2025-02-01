package D_Arrays;

// SOLVED ON LEETCODE
public class Q22_2Sum {
    // Solved in O(N^2) time complexity
    // and O(1) space complexity.
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;
    }
}
