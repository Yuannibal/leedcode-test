package com.yzh.greed;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 561.数组拆分
 * 给定长度为2n的整数数组nums,将这些数分成n对,例如 (a1, b1),(a2, b2),...,(an, bn),使得从1到 n 的min(ai, bi)总和最大
 * 返回最大总和
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Solution561.class})
public class Solution561Test {

    @InjectMocks
    private Solution561 solution;

    @Test
    public void test1() {
        int[] nums = {1, 4, 3, 2};
        int result = solution.arrayPairSum(nums);
        Assert.assertEquals(4, result);
    }

    @Test
    public void test2() {
        int[] nums = {6, 2, 6, 5, 1, 2};
        int result = solution.arrayPairSum(nums);
        Assert.assertEquals(9, result);
    }
}
