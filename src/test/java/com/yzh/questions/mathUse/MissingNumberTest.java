package com.yzh.questions.mathUse;

import org.junit.Assert;
import org.junit.Test;

/**
 * 268. 丢失的数字
 * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数
 */
public class MissingNumberTest {

    @Test
    public void test_1() {
        int[] nums = {3, 0, 1};
        Assert.assertEquals(2, new MissingNumber().missingNumber1(nums));
        Assert.assertEquals(2, new MissingNumber().missingNumber2(nums));
    }

    @Test
    public void test_2() {
        int[] nums = {0, 1};
        Assert.assertEquals(2, new MissingNumber().missingNumber1(nums));
        Assert.assertEquals(2, new MissingNumber().missingNumber2(nums));
    }

    @Test
    public void test_3() {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        Assert.assertEquals(8, new MissingNumber().missingNumber1(nums));
        Assert.assertEquals(8, new MissingNumber().missingNumber2(nums));
    }

    @Test
    public void test_4() {
        int[] nums = {0};
        Assert.assertEquals(1, new MissingNumber().missingNumber1(nums));
        Assert.assertEquals(1, new MissingNumber().missingNumber2(nums));
    }
}