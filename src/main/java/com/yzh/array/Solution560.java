package com.yzh.array;

/**
 * 560.和为K的子数组
 * 给你一个整数数组 nums 和一个整数 k ,请你统计并返回 该数组中和为 k 的子数组的个数
 * 子数组是数组中元素的连续非空序列
 */
public class Solution560 {

    /**
     * 暴力求解
     *
     * @param nums 数组
     * @param k 目标值
     * @result 子集数量
     */
    public int subarraySum(int[] nums, int k) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int target = 0;
            for (int j = i; j < nums.length; j++) {
                target = target  + nums[j];
                if (target == k) {
                    result++;
                }
            }
        }
        return result;
    }
}
