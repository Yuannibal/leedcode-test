package com.yzh.array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 34.在排序数组中查找元素的第一个和最后一个位置
 * 给你一个按照非递减顺序排列的整数数组 nums,和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置
 * 时间复杂度为 O(log n)
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Solution34.class})
public class Solution34Test {

    @InjectMocks
    private Solution34 solution;

    @Test
    public void test1() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = solution.searchRange(nums, target);
        int[] expected = {3, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void test2() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;

        int[] result = solution.searchRange(nums, target);
        int[] expected = {-1, -1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void test3() {
        int[] nums = {};
        int target = 0;

        int[] result = solution.searchRange(nums, target);
        int[] expected = {-1, -1};
        Assert.assertArrayEquals(expected, result);
    }
}
