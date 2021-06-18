package com.yzh.questions.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * 53. 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */
public class MaxSubArrayTest {

    @Test
    public void test_1() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Assert.assertEquals(6, (new MaxSubArray()).maxSubArray(nums));
    }

    @Test
    public void test_2() {
        int[] nums = {1};
        Assert.assertEquals(1, (new MaxSubArray()).maxSubArray(nums));
    }

    @Test
    public void test_3() {
        int[] nums = {0};
        Assert.assertEquals(0, (new MaxSubArray()).maxSubArray(nums));
    }

    @Test
    public void test_4() {
        int[] nums = {-1};
        Assert.assertEquals(-1, new MaxSubArray().maxSubArray(nums));
    }

    @Test
    public void test_5() {
        int[] nums = {-100000};
        Assert.assertEquals(-100000, new MaxSubArray().maxSubArray(nums));
    }

}