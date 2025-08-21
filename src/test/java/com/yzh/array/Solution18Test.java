package com.yzh.array;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 15.四数之和
 * 给你一个整数数组 nums,找出三元组 [nums[a], nums[b], nums[c], nums[d]]
 * 满足 nums[a] + nums[b] + nums[c] + nums[d] == target; 要求不重复的四元组
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Solution18.class})
public class Solution18Test {

    @InjectMocks
    private Solution18 solution;

    @Test
    public void test1() {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> result1 = solution.fourSum(nums, target);
        Assert.assertEquals(3, result1.size());
    }

    @Test
    public void test2() {
        int[] nums = {2, 2, 2, 2, 2};
        int target = 8;
        List<List<Integer>> result1 = solution.fourSum(nums, target);
        Assert.assertEquals(1, result1.size());
    }

    @Test
    public void test3() {
        int[] nums = {1000000000, 1000000000, 1000000000, 1000000000};
        int target = -294967296;
        List<List<Integer>> result1 = solution.fourSum(nums, target);
        Assert.assertEquals(0, result1.size());
    }
}
