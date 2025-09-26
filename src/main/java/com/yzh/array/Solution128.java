package com.yzh.array;

import java.util.Arrays;

/**
 * 128.最长连续序列
 * 给定一个未排序的整数数组 nums,找出数字连续的最长序列(不要求序列元素在原数组中连续)的长度
 * 要求 时间复杂度为 O(n)
 */
public class Solution128 {

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int result = 0;
        int record = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] - 1) {
                record++;
            } else if (nums[i] == nums[i + 1]) {
            } else {
                result = Math.max(result, record + 1);
                record = 0;
            }
        }
        return Math.max(result, record + 1);
    }
}
