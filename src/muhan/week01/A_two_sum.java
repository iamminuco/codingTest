package muhan.week01;

import java.util.Arrays;

public class A_two_sum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3,2,4}, 6)));
    }

}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // O(n^2)
        for (int i = 0; i < nums.length ; i++){
            for (int j = i + 1; j < nums.length ; j++){
                if (nums[i]+nums[j] == target){
                    return new int []{i , j};
                }
            }
        }
        return new int[]{};
    }
}
