package com.yzh.questions.numUse;

import org.junit.Assert;
import org.junit.Test;

/**
 * 66. 加一
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
public class PlusOneTest {

    @Test
    public void test_1() {
        int[] digits = {1, 2, 3};
        Assert.assertArrayEquals(new int[]{1, 2, 4}, new PlusOne().plusOne(digits));
    }

    @Test
    public void test_2() {
        int[] digits = {4, 3, 2, 1};
        Assert.assertArrayEquals(new int[]{4, 3, 2, 2}, new PlusOne().plusOne(digits));
    }

    @Test
    public void test_3() {
        int[] digits = {0};
        Assert.assertArrayEquals(new int[]{1}, new PlusOne().plusOne(digits));
    }
}