package com.yzh.array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 26.删除有序数组中的重复项
 * 给你一个升序的数组 nums,请你“原地”删除重复出现的元素;返回删除后数组的新长度
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Solution26.class})
public class Solution26Test {

    @InjectMocks
    private Solution26 solution;

    @Test
    public void test1() {
        int[] nums = {1, 1, 2};

        int result = solution.removeDuplicates(nums);
        Assert.assertEquals(2, result);
    }

    @Test
    public void test2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int result = solution.removeDuplicates(nums);
        Assert.assertEquals(5, result);
    }
}
