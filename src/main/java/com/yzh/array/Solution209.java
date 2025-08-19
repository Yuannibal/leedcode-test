package com.yzh.array;

/**
 * 209.长度最小的子数组
 * 给定一个含有n个正整数的数组和一个正整数target,找出该数组中满足其总和大于等于target的长度最小的子数组,并返回其长度
 * 如果不存在符合条件的子数组,返回 0
 */
public class Solution209 {

    /**
     * 长度最小的子数组
     *
     *
     * @param nums 数组
     * @param target 目标值
     * @result 最小的子数组长度
     */
    public int minSubArrayLen(int[] nums, int target) {
        int sum = 0;
        int len = Integer.MAX_VALUE;

        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            sum += nums[fast];
            if (sum >= target) {
                while (sum >= target) {
                    len = Math.min(fast - slow + 1, len);
                    sum -= nums[slow];
                    slow++;
                }
            }
        }

        if (len == Integer.MAX_VALUE) {
            return 0;
        } else {
            return len;
        }
    }
}
