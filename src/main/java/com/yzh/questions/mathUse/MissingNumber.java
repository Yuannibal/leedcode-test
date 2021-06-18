package com.yzh.questions.mathUse;

/**
 * 268. 丢失的数字
 * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数
 */
public class MissingNumber {

    /**
     * 方法一：数学
     */
    public int missingNumber1(int[] nums) {
        int result = nums.length * (nums.length + 1) / 2;  // 高斯定理(0 -- nums.length) 总共 (nums.length + 1)个数
        for (int num : nums) {
            result = result - num;
        }
        return result;
    }

    /**
     * 方法二：位运算(异或)
     *
     * 下标值 ^ 数值
     */
    public int missingNumber2(int[] nums) {
        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i] ^ i;
        }
        return result;
    }
}
