package com.yzh.array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 27.移除元素
 * 给你一个数组nums和一个值val,你需要"原地"移除所有数值等于val的元素,并返回移除后数组的新长度
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Solution27.class})
public class Solution27Test {

    @InjectMocks
    private Solution27 solution;

    @Test
    public void test1() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int result = solution.removeElement(nums, val);
        Assert.assertEquals(2, result);
    }

    @Test
    public void test2() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        int result = solution.removeElement(nums, val);
        Assert.assertEquals(5, result);
    }

    @Test
    public void test3() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int result = solution.removeElement(nums, val);
        Assert.assertEquals(2, result);
    }
}
