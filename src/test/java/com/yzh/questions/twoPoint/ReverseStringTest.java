package com.yzh.questions.twoPoint;


import org.junit.Assert;
import org.junit.Test;

/**
 * 344. 反转字符串
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 */
public class ReverseStringTest {

    @Test
    public void test_1() {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        (new ReverseString()).reverseString(s);
        Assert.assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, s);
    }

    @Test
    public void test_2() {
        char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
        (new ReverseString()).reverseString(s);
        Assert.assertArrayEquals(new char[]{'h', 'a', 'n', 'n', 'a', 'H'}, s);
    }
}