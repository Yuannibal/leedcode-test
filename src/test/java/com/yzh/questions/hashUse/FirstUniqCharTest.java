package com.yzh.questions.hashUse;

import org.junit.Assert;
import org.junit.Test;

/**
 * 387. 字符串中的第一个唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 */
public class FirstUniqCharTest {

    @Test
    public void test_1() {
        String s = "leetcode";
        Assert.assertEquals(0, new FirstUniqChar().firstUniqChar(s));
    }

    @Test
    public void test_2() {
        String s = "loveleetcode";
        Assert.assertEquals(2, new FirstUniqChar().firstUniqChar(s));
    }
}