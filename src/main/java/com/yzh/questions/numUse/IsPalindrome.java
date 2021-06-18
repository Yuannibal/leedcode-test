package com.yzh.questions.numUse;

/**
 * 9. 回文数
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
 */
public class IsPalindrome {

    /**
     * 方法一：
     * 反转了所有数字
     */
    public boolean isPalindrome1(int x) {
        // 负数不是回文数
        if (x < 0) {
            return false;
        }

        int result = 0;
        int temp = x;
        while (temp > 0) {
            result = result * 10 + temp % 10;
            temp = temp / 10;
        }

        return result == x;
    }

    /**
     * 方法二：
     * 反转一半的数字
     */
    public boolean isPalindrome2(int x) {
        // 0 是回文数
        if (x == 0) {
            return true;
        }

        // 负数不是回文数 || 末尾是0的数不是回文数
        if (x < 0 || x % 10 == 0) {
            return false;
        }

        int result = 0;
        while (x > 0) {
            result = result * 10 + x % 10;

            if (x == result) { // 121这种情况
                return true;
            }

            x = x / 10;
            if (x == result) { // 1221这种情况
                return true;
            }
        }
        return false;
    }
}
