package com.yzh.questions.mathUse;

/**
 * 172. 阶乘后的零
 * 给定一个整数 n，返回 n! 结果尾数中零的数量。
 */
public class TrailingZeroes {

    /**
     * 方法一：计算因子 2 * 5
     * (1)个阶乘组成的数字，5的因数总比2多，所以只用统计5就可以了
     * (2)可以5个5个的递进
     */
    public int trailingZeroes1(int n) {
        int zeroCount = 0;
        for (int i = 5; i <= n; i += 5) {
            int powerOf5 = 5;
            while (i % powerOf5 == 0) {
                zeroCount += 1;
                powerOf5 *= 5;
            }
        }
        return zeroCount;
    }

}
