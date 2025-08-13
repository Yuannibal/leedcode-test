package com.yzh.array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 209.长度最小的子数组
 * 给定一个含有n个正整数的数组和一个正整数target,找出该数组中满足其总和大于等于target的长度最小的子数组,并返回其长度
 * 如果不存在符合条件的子数组,返回 0
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Solution209.class})
public class Solution209Test {

    @InjectMocks
    private Solution209 solution;


    @Test
    public void test1() {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int result = solution.minSubArrayLen(nums, target);
        Assert.assertEquals(2, result);
    }

    @Test
    public void test2() {
        int[] nums = {1, 4, 4};
        int target = 4;

        int result = solution.minSubArrayLen(nums, target);
        Assert.assertEquals(1, result);
    }

    @Test
    public void test3() {
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        int target = 11;

        int result = solution.minSubArrayLen(nums, target);
        Assert.assertEquals(0, result);
    }
}
