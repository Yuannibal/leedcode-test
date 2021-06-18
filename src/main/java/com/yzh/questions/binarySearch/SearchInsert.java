package com.yzh.questions.binarySearch;

/**
 * 35. 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 */
public class SearchInsert {

    /**
     * 二分查找
     * 它成立的条件为：nums[pos - 1] < target <= nums[pos]
     * 在一个有序数组中找第一个大于等于 target 的下标
     *
     * 时间复杂度：O(log n)，其中 n 为数组的长度。二分查找所需的时间复杂度为 O(log n)
     * 空间复杂度：O(1)。我们只需要常数空间存放若干变量
     */
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = nums.length;

        // 用等号 mid可以取到边界值
        // 极端条件 mid == left == right  (1)left(变) > right(不变)  (2)right(变) < left(不变) (3)但是mid是可以选择让其不变的
        while (left <= right) {
            int mid = left + ((right - left) >> 1);

            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {  // target < nums[mid]
                right = mid - 1;
                result = mid;
            }
        }
        return result;
    }
}
