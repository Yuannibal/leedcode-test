package com.yzh.questions.bitCalculate;

/**
 * 461. 汉明距离
 * 两个整数之间的 汉明距离 指的是这两个数字对应二进制位不同的位置的数目。
 * 给你两个整数 x 和 y，计算并返回它们之间的汉明距离。
 *
 * 汉明距离广泛应用于多个领域。在编码理论中用于错误检测，在信息论中量化字符串之间的差异
 */
public class HammingDistance {

    /**
     * 方法一: 移位 + 逐位判断是否相等
     * 注意: 左移运算符<< ,低位补零
     */
    public int hammingDistance1(int x, int y) {
        int result = 0;
        for (int i = 0; i < 31; i++) {   // 2进制首位表示符号
            if (((1 << i) & x) != ((1 << i) & y)) {
                result++;
            }
        }
        return result;
    }

    /**
     * 方法二：异或 + 内置位计数功能
     */
    public int hammingDistance21(int x, int y) {
        int result = x ^ y;
        return Integer.bitCount(result);
    }

    /**
     * 方法二：异或 + 移位实现位计数
     * 注意：(1) 无符号右移运算符   >>>   高位补0
     * (2) 带符号的右移运算符  >>    如果是正数，在高位补零;如果是负数，则在高位补1
     */
    public int hammingDistance22(int x, int y) {
        int result = 0;
        int operator = x ^ y;
        while (operator != 0) {
            if ((operator & 1) == 1) {
                result++;
            }
            operator = operator >> 1;
        }

        return result;
    }


    /**
     * 方法三：Brian Kernighan 算法
     * n & (n−1)，其运算结果恰为把 n 的二进制位中的最低位的 1 变为 0 之后的结果
     */
    public int hammingDistance3(int x, int y) {
        int result = 0;
        int operator = x ^ y;
        while (operator != 0) {
            result++;
            operator = operator & (operator - 1);
        }
        return result;
    }

}
