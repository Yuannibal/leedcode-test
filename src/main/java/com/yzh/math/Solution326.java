package com.yzh.math;

/**
 * 326. 3的幂
 * 给定一个整数,写一个函数来判断它是否是 3 的幂次方;如果是返回true,否则返回false
 */
public class Solution326 {

    /**
     * 循环试除
     *
     * @param n 数据
     * @result 函数结果
     */
    public boolean isPowerOfThree(int n) {
        while (n > 0 && n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
