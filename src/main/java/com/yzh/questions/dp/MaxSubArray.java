package com.yzh.questions.dp;

/**
 * 53. 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */
public class MaxSubArray {

    /**
     * 方法一：动态规划
     *
     * 假设 nums 数组的长度是 n，下标从 0 到 n-1
     * 我们用 f(i) 代表以第 i 个数结尾的[连续子数组的最大和]
     * 那么很显然我们要求的答案就是： max{f(i)}   0 <= i <= n-1
     *
     * 因此我们只需要求出每个位置的 f(i)，然后返回 f 数组中的最大值即可
     * 我们可以考虑 nums[i] 单独成为一段还是加入 f(i−1) 对应的那一段，这取决于 nums[i] 和 f(i−1)+nums[i] 的大小
     * 动态规划转移方程： f(i) = max{f(i - 1) + nums[i], nums[i]}
     *
     * 空间复杂度 O(n) 的实现，即用一个 f数组来保存 f(i) 的值
     * 空间复杂度：O(1)的实现，考虑到 f(i) 只和 f(i-1) 相关，于是我们可以只用一个变量 pre 来维护对于当前 f(i) 的 f(i-1) 的值是多少
     */
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int addMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            addMax = Math.max(nums[i], addMax + nums[i]);
            result = Math.max(result, addMax);
        }

        return result;
    }
}
