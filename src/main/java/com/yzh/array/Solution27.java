package com.yzh.array;

/**
 * 27.移除元素
 * 给你一个数组nums和一个值val,你需要"原地"移除所有数值等于val的元素,并返回移除后数组的新长度
 */
public class Solution27 {

    /**
     * 移除元素
     * 思路:快指针遍历元素,慢指针更改替换的元素
     *
     * @param nums 数组
     * @param val 值
     * @result 新长度
     */
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
