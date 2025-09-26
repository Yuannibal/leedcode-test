package com.yzh.array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 128.最长连续序列
 * 给定一个未排序的整数数组 nums,找出数字连续的最长序列(不要求序列元素在原数组中连续)的长度
 * 要求 时间复杂度为 O(n)
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Solution128Test.class})
public class Solution128Test {

    @InjectMocks
    private Solution128 solution;

    @Test
    public void test1() {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = solution.longestConsecutive(nums);
        Assert.assertEquals(4, result);
    }

    @Test
    public void test2() {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int result = solution.longestConsecutive(nums);
        Assert.assertEquals(9, result);
    }

    @Test
    public void test3() {
        int[] nums = {1, 0, 1, 2};
        int result = solution.longestConsecutive(nums);
        Assert.assertEquals(3, result);
    }
}
