package com.yzh.math;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 9.回文数
 * 给你一个整数 x,判断其是否是回文数
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Solution9.class})
public class Solution9Test {

    @InjectMocks
    private Solution9 solution;

    @Test
    public void test1() {
        int x = 121;
        boolean result = solution.isPalindrome(x);
        Assert.assertTrue(result);
    }

    @Test
    public void test2() {
        int x = -121;
        boolean result = solution.isPalindrome(x);
        Assert.assertFalse(result);
    }

    @Test
    public void test3() {
        int x = 10;
        boolean result = solution.isPalindrome(x);
        Assert.assertFalse(result);
    }
}
