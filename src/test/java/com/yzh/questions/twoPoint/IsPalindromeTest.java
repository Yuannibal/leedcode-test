package com.yzh.questions.twoPoint;

import org.junit.Assert;
import org.junit.Test;

/**
 * 125. 验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 */
public class IsPalindromeTest {

    @Test
    public void test_1() {
        String s = "A man, a plan, a canal: Panama";
        Assert.assertTrue((new IsPalindrome()).isPalindrome(s));
    }

    @Test
    public void test_2() {
        String s = "race a car";
        Assert.assertFalse((new IsPalindrome()).isPalindrome(s));
    }
}