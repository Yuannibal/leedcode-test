package com.yzh.array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 35.搜索插入位置
 * 给定一个排序数组和一个目标值,在数组中找到目标值,并返回其索引;如果目标值不存在于数组中,返回它将会被按顺序插入的位置
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Solution35Test.class})
public class Solution35Test {

    @InjectMocks
    private Solution35 solution;

    @Test
    public void test1() {
        int[] nums = {1, 3, 5, 6};
        int target = 5;

        int result = solution.searchInsert(nums, target);
        Assert.assertEquals(2, result);
    }

    @Test
    public void test2() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;

        int result = solution.searchInsert(nums, target);
        Assert.assertEquals(1, result);
    }

    @Test
    public void test3() {
        int[] nums = {1, 3, 5, 6};
        int target = 7;

        int result = solution.searchInsert(nums, target);
        Assert.assertEquals(4, result);
    }

}
