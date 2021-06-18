package com.yzh.questions.bitCalculate;

/**
 * 342. 4的幂
 * 给定一个整数，写一个函数来判断它是否是 4 的幂次方。如果是，返回 true ；否则，返回 false 。
 */
public class IsPowerOfFour {

    /**
     * 方法一：取模性质
     * 思路一: 2的幂 && n % 4 == 0 但是 1 判断不了，并且 0 也不好判断
     * 思路二: 2的幂 && n % 3 == 1 绕开了 1 的存在
     */
    public boolean isPowerOfFour1(int n) {
        return ((n & (n - 1)) == 0) && (n % 3 == 1);
    }

    /**
     * 方法二：二进制表示中 1 的位置(32位有效)
     */
    public boolean isPowerOfFour21(int n) {
        // mask=(10101010101010101010101010101010)2 = (AAAAAAAA)16
        return (n > 0) &&((n & (n - 1)) == 0) && ((n & (0xAAAAAAAA)) == 0);

    }
    public boolean isPowerOfFour22(int n) {
        // mask=(01010101010101010101010101010101)2 = (55555555)16
        return (n > 0) &&((n & (n - 1)) == 0) && ((n & (0x55555555)) != 0);
    }
}
