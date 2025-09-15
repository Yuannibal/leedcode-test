package com.yzh.array;

/**
 * 33.搜索旋转排序数组
 * 整数数组 nums 按升序排列,数组中的值互不相同
 * 在传递给函数之前, nums 在未知的下标 k(0 <= k < nums.length)上进行了向左旋转
 * 使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]
 * 给你旋转后的数组 nums 和一个整数target,如果 nums中存在这个目标值target,则返回它的下标,否则返回 -1
 * 时间复杂度为 O(log n)
 */
public class Solution33 {

    /**
     *
     * 二分查找
     * 思路:将数组一分为二,其中一定有一个是有序的,另一个部分有序;
     * 有序其在范围的部分用二分法查找;无序部分再一分为二;
     *
     * @param nums 数组
     * @param target 目标值
     * @result 下标
     */
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[left] <= nums[mid]) {  // left 到 mid 是顺序区间
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {  // mid 到 right 是顺序区间
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
