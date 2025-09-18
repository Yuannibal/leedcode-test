package com.yzh.math;

import com.yzh.recursion.Solution509;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 326. 3的幂
 * 给定一个整数,写一个函数来判断它是否是 3 的幂次方;如果是返回true,否则返回false
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Solution326.class})
public class Solution326Test {

    @InjectMocks
    private Solution326 solution;

    @Test
    public void test1() {
        int n = 27;
        boolean result = solution.isPowerOfThree(n);
        Assert.assertTrue(result);
    }

    @Test
    public void test2() {
        int n = 0;
        boolean result = solution.isPowerOfThree(n);
        Assert.assertFalse(result);
    }

    @Test
    public void test3() {
        int n = 9;
        boolean result = solution.isPowerOfThree(n);
        Assert.assertTrue(result);
    }

    @Test
    public void test4() {
        int n = 45;
        boolean result = solution.isPowerOfThree(n);
        Assert.assertFalse(result);
    }
}