package com.yzh.questions.stringUse;

import org.junit.Assert;
import org.junit.Test;

/**
 * 14. 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class LongestCommonPrefixTest {

    @Test
    public void test_1() {
        String[] sirs = {"flower", "flow", "flight"};
        Assert.assertEquals("fl", new LongestCommonPrefix().longestCommonPrefix1(sirs));
    }

    @Test
    public void test_2() {
        String[] sirs = {"dog", "racecar", "car"};
        Assert.assertEquals("", new LongestCommonPrefix().longestCommonPrefix1(sirs));
    }

}