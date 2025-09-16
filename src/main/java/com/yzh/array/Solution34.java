package com.yzh.array;

/**
 * 34.在排序数组中查找元素的第一个和最后一个位置
 * 给你一个按照非递减顺序排列的整数数组 nums,和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置
 * 时间复杂度为 O(log n)
 */
public class Solution34 {

    /**
     *
     * 二分查找
     *
     * @param nums 数组
     * @param target 目标值
     * @result 下标
     */
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid;
                right = mid;
                while (left - 1 >= 0 && nums[left - 1] == target) {
                    left--;
                }
                while (right + 1 <= nums.length - 1 && nums[right + 1] == target) {
                    right++;
                }
                return new int[]{left, right};
            }
        }
        return new int[]{-1, -1};
    }
}
