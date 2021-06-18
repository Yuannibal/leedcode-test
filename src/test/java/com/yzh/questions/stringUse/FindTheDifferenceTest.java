package com.yzh.questions.stringUse;


import org.junit.Assert;
import org.junit.Test;

/**
 * 389. 找不同
 * 给定两个字符串 s 和 t，它们只包含小写字母
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母
 * 请找出在 t 中被添加的字母
 */
public class FindTheDifferenceTest {

    @Test
    public void test_1() {
        String s = "abcd";
        String t = "abcde";

        Assert.assertEquals('e', (new FindTheDifference()).findTheDifference(s, t));
    }

    @Test
    public void test_2() {
        String s = "";
        String t = "y";

        Assert.assertEquals('y', (new FindTheDifference()).findTheDifference(s, t));
    }

    @Test
    public void test_3() {
        String s = "aa";
        String t = "aaa";

        Assert.assertEquals('a', (new FindTheDifference()).findTheDifference(s, t));
    }

    @Test
    public void test_4() {
        String s = "ae";
        String t = "aea";

        Assert.assertEquals('a', (new FindTheDifference()).findTheDifference(s, t));
    }
}