package com.yzh.math;

/**
 * 9.回文数
 * 给你一个整数 x,判断其是否是回文数
 */
public class Solution9 {

    /**
     * 是否是回文数
     *
     * @param x 输入值
     * @result 是否是回文数
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int y = x;
        int z = 0;
        while (y > 0) {
            z = z * 10 + y % 10;
            y = y / 10;
        }
        return x == z;
    }
}
