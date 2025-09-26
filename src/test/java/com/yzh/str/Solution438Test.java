package com.yzh.str;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 438.找到字符串中所有字母异位词
 * 给定两个字符串 s 和 p, 找到 s 中所有 p 的 异位词 的子串,返回这些子串的起始索引
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Solution438.class})
public class Solution438Test {

    @InjectMocks
    private Solution438 solution;

    @Test
    public void test1() {
        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> result = solution.findAnagrams(s, p);
        Assert.assertEquals(2, result.size());
    }

    @Test
    public void test2() {
        String s = "abab";
        String p = "ab";

        List<Integer> result = solution.findAnagrams(s, p);
        Assert.assertEquals(3, result.size());
    }
}
