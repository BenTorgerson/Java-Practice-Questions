/**
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int first = 0;
        int second = 1;
        boolean found = false;
        while (!found) {
            while (second < length) {
                if (nums[first] + nums[second] == target) {
                    int[] answer = {first, second};
                    return answer;
                }
                else {
                    if (second + 1 != first) {
                        second++;
                    }
                    else { second = second + 2;}
                }
            }
            first++;
            second = 0;
        }
        int[] failed = {0,0};
        return failed;
    }
}