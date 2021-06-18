package com.yzh.questions.stringUse;

import org.junit.Assert;
import org.junit.Test;

/**
 * 3. 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class LengthOfLongestSubstringTest {

    @Test
    public void test_1() {
        String s = "abcabcbb";
        Assert.assertEquals(3, (new LengthOfLongestSubstring()).lengthOfLongestSubstring(s));
    }

    @Test
    public void test_2() {
        String s = "bbbbb";
        Assert.assertEquals(1, (new LengthOfLongestSubstring()).lengthOfLongestSubstring(s));
    }

    @Test
    public void test_3() {
        String s = "pwwkew";
        Assert.assertEquals(3, (new LengthOfLongestSubstring()).lengthOfLongestSubstring(s));
    }

    @Test
    public void test_4() {
        String s = "";
        Assert.assertEquals(0, (new LengthOfLongestSubstring()).lengthOfLongestSubstring(s));
    }
}