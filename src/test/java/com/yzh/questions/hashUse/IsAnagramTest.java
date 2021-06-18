package com.yzh.questions.hashUse;

import org.junit.Assert;
import org.junit.Test;

/**
 * 242. 有效的字母异位词
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 */
public class IsAnagramTest {

    @Test
    public void test_1() {
        String s = "anagram";
        String t = "nagaram";
        Assert.assertTrue(new IsAnagram().isAnagram1(s, t));
        Assert.assertTrue(new IsAnagram().isAnagram2(s, t));
    }

    @Test
    public void test_2() {
        String s = "rat";
        String t = "car";
        Assert.assertFalse(new IsAnagram().isAnagram1(s, t));
        Assert.assertFalse(new IsAnagram().isAnagram2(s, t));
    }

    @Test
    public void test_3() {
        String s = "aacc";
        String t = "ccac";
        Assert.assertFalse(new IsAnagram().isAnagram1(s, t));
        Assert.assertFalse(new IsAnagram().isAnagram2(s, t));
    }
}