package com.yzh.questions.numUse;


import org.junit.Assert;
import org.junit.Test;

/**
 * 9. 回文数
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
 */
public class IsPalindromeTest {

    @Test
    public void test_1() {
        int x = 121;
        Assert.assertTrue(new IsPalindrome().isPalindrome1(x));
        Assert.assertTrue(new IsPalindrome().isPalindrome2(x));
    }

    @Test
    public void test_2() {
        int x = 11;
        Assert.assertTrue(new IsPalindrome().isPalindrome1(x));
        Assert.assertTrue(new IsPalindrome().isPalindrome2(x));
    }

    @Test
    public void test_3() {
        int x = -121;
        Assert.assertFalse(new IsPalindrome().isPalindrome1(x));
        Assert.assertFalse(new IsPalindrome().isPalindrome2(x));
    }

    @Test
    public void test_4() {
        int x = 10;
        Assert.assertFalse(new IsPalindrome().isPalindrome1(x));
        Assert.assertFalse(new IsPalindrome().isPalindrome2(x));
    }

    @Test
    public void test_5() {
        int x = 0;
        Assert.assertTrue(new IsPalindrome().isPalindrome1(x));
        Assert.assertTrue(new IsPalindrome().isPalindrome2(x));
    }
}