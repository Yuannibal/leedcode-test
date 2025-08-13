package com.yzh.array;

/**
 * 977.有序数组的平方
 * 给你一个 升序的整数数组 nums,返回 每个数字的平方 组成的新数组,要求也按 升序 排序
 */
public class Solution977 {

    /**
     * 有序数组的平方
     * 方法:左右指针
     *
     * @param nums 升序数组
     * @result 升序平方数组
     */
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                result[i] = nums[left] * nums[left];
                left++;
            } else {
                result[i] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }
}
