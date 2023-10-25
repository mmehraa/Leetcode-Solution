/*
    1480. Running Sum of 1d Array ( https://leetcode.com/problems/running-sum-of-1d-array )

    Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
    Return the running sum of nums.

    Example 1:
              Input: nums = [1,2,3,4]
              Output: [1,3,6,10]
              Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
*/

class Solution {
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            int sum = 0;
            for (int j = 0; j < i + 1; j++){
                sum += nums[j];
            }
            arr[i] = sum;
        }
        return arr;
    }
}
