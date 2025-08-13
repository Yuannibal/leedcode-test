package com.yzh.array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 1.两数之和
 * 给定一个整数数组nums和一个整数目标值target,请你在该数组中找出和为目标值target的那两个整数,并返回它们的数组下标
 * 假设每种输入只会对应一个答案,并且你不能使用两次相同的元素
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Solution1.class})
public class Solution1Test {

    @InjectMocks
    private Solution1 solution;

    @Test
    public void test1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);
        int[] expected = {0, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void test2() {
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] result = solution.twoSum(nums, target);
        int[] expected = {1, 2};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void test3() {
        int[] nums = {3, 3};
        int target = 6;

        int[] result = solution.twoSum(nums, target);
        int[] expected = {0, 1};
        Assert.assertArrayEquals(expected, result);
    }
}
