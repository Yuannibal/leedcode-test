package com.yzh.array;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 15. 三数之和
 * 给你一个整数数组 nums,找出三元组 [nums[i], nums[j], nums[k]]
 * 满足 nums[i] + nums[j] + nums[k] == 0;满足 i != j、i != k 且 j != k。
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Solution15.class})
public class Solution15Test {

    @InjectMocks
    private Solution15 solution;

    @Test
    public void test1() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = solution.threeSum1(nums);
        Assert.assertEquals(2, result.size());
    }

    @Test
    public void test2() {
        int[] nums = {0, 1, 1};
        List<List<Integer>> result = solution.threeSum1(nums);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void test3() {
        int[] nums = {0, 0, 0};
        List<List<Integer>> result = solution.threeSum1(nums);
        Assert.assertEquals(1, result.size());
    }

}
