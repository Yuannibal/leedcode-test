package com.yzh.questions.stringUse;


import org.junit.Assert;
import org.junit.Test;

/**
 * 28. 实现 strStr()
 * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。
 */
public class StrStrTest {

    @Test
    public void test_1() {
        String haystack = "hello";
        String needle = "ll";
        Assert.assertEquals(2, (new StrStr()).strStr1(haystack, needle));
    }

    @Test
    public void test_2() {
        String haystack = "aaaaa";
        String needle = "bba";
        Assert.assertEquals(-1, (new StrStr()).strStr1(haystack, needle));
    }

    @Test
    public void test_3() {
        String haystack = "111";
        String needle = "";
        Assert.assertEquals(0, (new StrStr()).strStr1(haystack, needle));
    }

    @Test
    public void test_5() {
        String haystack = "";
        String needle = "a";
        Assert.assertEquals(-1, (new StrStr()).strStr1(haystack, needle));
    }

    @Test
    public void test_6() {
        String haystack = "";
        String needle = "";
        Assert.assertEquals(0, (new StrStr()).strStr1(haystack, needle));
    }

    @Test
    public void test_7() {
        String haystack = "aaaa";
        String needle = "aaaa";
        Assert.assertEquals(0, (new StrStr()).strStr1(haystack, needle));
    }

    @Test
    public void test_8() {
        String haystack = "aaaa";
        String needle = "aaaaa";
        Assert.assertEquals(-1, (new StrStr()).strStr1(haystack, needle));
    }
}