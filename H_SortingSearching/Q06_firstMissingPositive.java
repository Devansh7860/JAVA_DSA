package H_SortingSearching;


// LEETCODE QUESTION 
// https://leetcode.com/problems/first-missing-positive/
  
public class Q06_firstMissingPositive {
    // Find the first missing smallest positive integer in the array 
 

    public int firstMissingPositive(int[] nums) {
        // OPTIMISED APPROACH USING CYCLIC SORT
        for (int i = 0; i < nums.length; i++) {
            try {
                while (nums[i] != nums[nums[i] - 1] && nums[i] > 0 && nums[i] <= nums.length) {
                    int temp = nums[nums[i] - 1];
                    nums[nums[i] - 1] = nums[i];
                    nums[i] = temp;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Index is out of bounds.");
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i] - 1) {
                return i+1;
            }
        }
        return nums.length+1;


        // Brute force approach tc = O(n*logn)

        /* Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (nums[i] != 1) {
                    return 1;
                } else {
                    int c = 2;
                    try {
                        while (i + 1 < nums.length) {
                            if (nums[i + 1] - nums[i] == 1) {
                                c = nums[i + 1] + 1;
                            } else if (nums[i + 1] - nums[i] > 1) {
                                return c;
                            }
                            i++;
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Error: Index is out of bounds.");
                    }
                    return c;
                }
            }

        }
        return 1;
        */
    }
}
