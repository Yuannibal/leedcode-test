package com.yzh.questions.bitCalculate;

/**
 * 191. 位1的个数
 * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
 */
public class HammingWeight {

    /**
     * 方法一：循环检查二进制
     *
     * 时间复杂度：O(k)，其中 k 是 int 型的二进制位数，k=32。
     */
    public int hammingWeight1(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {       // int 2的31次方表正数,2的31次方表负数
            if (((1 << i) & n) != 0) {       // 关系运算符 优先级大于 逻辑运算符;要用括号括起来
                result++;
            }
        }
        return result;
    }

    /**
     * 方法二：位运算优化 （Brian Kernighan）
     * n & (n−1)，其运算结果恰为把 n 的二进制位中的最低位的 1 变为 0 之后的结果
     */
    public int hammingWeight2(int n) {
        int result = 0;
        while (n != 0) {
            n = n & (n - 1);
            result++;
        }
        return result;
    }
}
