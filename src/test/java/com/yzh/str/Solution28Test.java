package com.yzh.str;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 28.找出字符串中第一个匹配项的下标
 * 给你两个字符串 haystack 和 needle，
 * 在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标;如果 needle 不是 haystack 的一部分,返回  -1
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Solution28.class})
public class Solution28Test {

    @InjectMocks
    private Solution28 solution;

    @Test
    public void test1() {
        String haystack = "sadbutsad";
        String needle = "sad";

        int result = solution.strStr(haystack, needle);
        Assert.assertEquals(0, result);
    }

    @Test
    public void test2() {
        String haystack = "leetcode";
        String needle = "leeto";

        int result = solution.strStr(haystack, needle);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void test3() {
        String haystack = "hello";
        String needle = "ll";

        int result = solution.strStr(haystack, needle);
        Assert.assertEquals(2, result);
    }
}
