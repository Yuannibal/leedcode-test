package com.yzh.array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 977.有序数组的平方
 * 给你一个 升序的整数数组 nums,返回 每个数字的平方 组成的新数组,要求也按 升序 排序
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Solution977.class})
public class Solution977Test {

    @InjectMocks
    private Solution977 solution;

    @Test
    public void test1() {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = solution.sortedSquares(nums);

        int[] target = {0, 1, 9, 16, 100};
        Assert.assertArrayEquals(result, target);
    }

    @Test
    public void test2() {
        int[] nums = {-7, -3, 2, 3, 11};
        int[] result = solution.sortedSquares(nums);

        int[] target = {4, 9, 9, 49, 121};
        Assert.assertArrayEquals(result, target);
    }

    @Test
    public void test3() {
        int[] nums = {-1};
        int[] result = solution.sortedSquares(nums);

        int[] target = {1};
        Assert.assertArrayEquals(result, target);
    }
}