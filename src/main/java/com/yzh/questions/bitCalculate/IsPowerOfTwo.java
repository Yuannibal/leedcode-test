package com.yzh.questions.bitCalculate;

/**
 * 231. 2 的幂
 * 给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。
 */
public class IsPowerOfTwo {

    /**
     * 方法一: (n & (n - 1)) == 0
     */
    public boolean isPowerOfTwo1(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }

    /**
     * 方法二: (n & (-n)) == n
     * 由于负数是按照补码规则在计算机中存储的，-n 的二进制表示为 n 的二进制表示的每一位取反再加上 1
     */
    public boolean isPowerOfTwo2(int n) {
        return (n > 0) && ((n & (-n)) == n);
    }
}
