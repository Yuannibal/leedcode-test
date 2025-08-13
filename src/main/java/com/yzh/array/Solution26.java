package com.yzh.array;

/**
 * 26.删除有序数组中的重复项
 * 给你一个升序的数组 nums,请你“原地”删除重复出现的元素;返回删除后数组的新长度
 */
public class Solution26 {

    /**
     * 删除有序数组中的重复项
     *
     * @param nums 有序数组
     * @result 新长度
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return 1;
        }

        int slow = 1;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
