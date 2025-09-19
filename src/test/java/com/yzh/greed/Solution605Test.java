package com.yzh.greed;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 455.种花问题
 * 有一个很长的花坛,一部分地块种植了花,另一部分却没有;花不能种植在相邻的地块上,它们会争夺水源,两者都会死去
 * 给你一个整数数组flowerbed表示花坛,0:没种植花,1:种了花
 * 能否在不打破种植规则的情况下种入 n 朵花
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Solution605.class})
public class Solution605Test {

    @InjectMocks
    private Solution605 solution;

    @Test
    public void test1() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        boolean result = solution.canPlaceFlowers(flowerbed, n);
        Assert.assertTrue(result);
    }

    @Test
    public void test2() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 2;
        boolean result = solution.canPlaceFlowers(flowerbed, n);
        Assert.assertFalse(result);
    }
}
