package com.yzh.array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 33.搜索旋转排序数组
 * 整数数组 nums 按升序排列,数组中的值互不相同
 * 在传递给函数之前, nums 在未知的下标 k(0 <= k < nums.length)上进行了向左旋转
 * 使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]
 * 给你旋转后的数组 nums 和一个整数target,如果 nums中存在这个目标值target,则返回它的下标,否则返回 -1
 * 时间复杂度为 O(log n)
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Solution33.class})
public class Solution33Test {

    @InjectMocks
    private Solution33 solution;

    @Test
    public void test1() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int result = solution.search(nums, target);
        Assert.assertEquals(4, result);
    }

    @Test
    public void test2() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;

        int result = solution.search(nums, target);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void test3() {
        int[] nums = {1};
        int target = 0;

        int result = solution.search(nums, target);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void test4() {
        int[] nums = {5, 1, 3};
        int target = 5;

        int result = solution.search(nums, target);
        Assert.assertEquals(0, result);
    }

}
