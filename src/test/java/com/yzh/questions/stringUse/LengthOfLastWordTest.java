package com.yzh.questions.stringUse;


import org.junit.Assert;
import org.junit.Test;

/**
 * 58. 最后一个单词的长度
 *
 * 给你一个字符串 s，由若干单词组成，单词之间用空格隔开。返回字符串中最后一个单词的长度。
 * 如果不存在最后一个单词，请返回 0 。
 */
public class LengthOfLastWordTest {

    @Test
    public void test_1() {
        String s = "Hello World";
        Assert.assertEquals(5, (new LengthOfLastWord()).lengthOfLastWord(s));
    }

    @Test
    public void test_2() {
        String s = " ";
        Assert.assertEquals(0, (new LengthOfLastWord()).lengthOfLastWord(s));
    }

    @Test
    public void test_3() {
        String s = "a";
        Assert.assertEquals(1, (new LengthOfLastWord()).lengthOfLastWord(s));
    }
}