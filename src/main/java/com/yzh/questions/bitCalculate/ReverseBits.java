package com.yzh.questions.bitCalculate;

/**
 * 190. 颠倒二进制位
 * 颠倒给定的 32 位无符号整数的二进制位。
 */
public class ReverseBits {

    /**
     * 方法一：逐位颠倒
     */
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) + (n & 1);
            n = n >>> 1;
        }
        return result;
    }
}
