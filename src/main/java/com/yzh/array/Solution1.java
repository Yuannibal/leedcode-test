package com.yzh.array;

/**
 * 1.两数之和
 * 给定一个整数数组nums和一个整数目标值target,请你在该数组中找出和为目标值target的那两个整数,并返回它们的数组下标
 * 假设每种输入只会对应一个答案,并且你不能使用两次相同的元素
 */
public class Solution1 {

    /**
     * 两数之和
     *
     * @param nums 数组
     * @param target 目标值
     * @result 数组下标
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
