package com.yzh.array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 560.和为K的子数组
 * 给你一个整数数组 nums 和一个整数 k ,请你统计并返回 该数组中和为 k 的子数组的个数
 * 子数组是数组中元素的连续非空序列
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Solution560.class})
public class Solution560Test {

    @InjectMocks
    private Solution560 solution;

    @Test
    public void test1() {
        int[] nums = {1, 1, 1};
        int k = 2;
        int result = solution.subarraySum(nums, k);
        Assert.assertEquals(2, result);
    }

    @Test
    public void test2() {
        int[] nums = {1, 2, 3};
        int k = 3;
        int result = solution.subarraySum(nums, k);
        Assert.assertEquals(2, result);
    }

    @Test
    public void test3() {
        int[] nums = {-1, -1, 1};
        int k = 0;
        int result = solution.subarraySum(nums, k);
        Assert.assertEquals(1, result);
    }

    @Test
    public void test4() {
        int[] nums = {1, 2, 1, 2, 1};
        int k = 3;
        int result = solution.subarraySum(nums, k);
        Assert.assertEquals(4, result);
    }
}
