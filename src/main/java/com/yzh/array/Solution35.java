package com.yzh.array;

/**
 * 35.搜索插入位置
 * 给定一个排序数组和一个目标值,在数组中找到目标值,并返回其索引;如果目标值不存在于数组中,返回它将会被按顺序插入的位置
 */
public class Solution35 {

    /**
     * 搜索插入位置
     * 方法:二分法--将时间复杂度从O(n)变为O(logn)
     *
     * @param nums 升序不重复的数组
     * @param target 目标值
     * @result 下标
     */
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left;
    }
}
