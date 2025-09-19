package com.yzh.greed;

import java.util.Arrays;

/**
 * 561.数组拆分
 * 给定长度为2n的整数数组nums,将这些数分成n对,例如 (a1, b1),(a2, b2),...,(an, bn),使得从1到 n 的min(ai, bi)总和最大
 * 返回最大总和
 */
public class Solution561 {

    /**
     * 排序 + 贪心
     * @param nums 整数数组
     * @result 最大值
     */
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            sum += Math.min(nums[i], nums[i + 1]);
        }
        return sum;
    }
}
