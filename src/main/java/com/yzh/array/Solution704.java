package com.yzh.array;

/**
 * 704.二分查找
 * 给定一个n个元素有序的(升序)整型数组nums和一个目标值 target,写一个函数搜索nums中的target,如果目标值存在返回下标,否则返回 -1
 * 关键词:有序数组、无重复元素
 */
public class Solution704 {

    /**
     * 二分查找
     *
     * @param nums 升序不重复的数组
     * @param target 目标值
     * @result 下标
     */
    public int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
