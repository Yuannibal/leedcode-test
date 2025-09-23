package com.yzh.set;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 3.无重复字符的最长子串
 * 给定一个字符串 s,请你找出其中不含有重复字符的 最长 子串 的长度。
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Solution3.class})
public class Solution3Test {

    @InjectMocks
    private Solution3 solution;

    @Test
    public void test1() {
        String s = "abcabcbb";
        int result = solution.lengthOfLongestSubstring(s);
        Assert.assertEquals(3, result);
    }

    @Test
    public void test2() {
        String s = "bbbbb";
        int result = solution.lengthOfLongestSubstring(s);
        Assert.assertEquals(1, result);
    }

    @Test
    public void test3() {
        String s = "pwwkew";
        int result = solution.lengthOfLongestSubstring(s);
        Assert.assertEquals(3, result);
    }

    @Test
    public void test4() {
        String s = "a";
        int result = solution.lengthOfLongestSubstring(s);
        Assert.assertEquals(1, result);
    }

    @Test
    public void test5() {
        String s = "dvdf";
        int result = solution.lengthOfLongestSubstring(s);
        Assert.assertEquals(3, result);
    }
}
