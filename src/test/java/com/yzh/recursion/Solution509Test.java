package com.yzh.recursion;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 509.斐波那契数
 * F(0) = 0; F(1) = 1
 * F(n) = F(n - 1) + F(n - 2)
 * 给定 n ,请计算 F(n)
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Solution509.class})
public class Solution509Test {

    @InjectMocks
    private Solution509 solution;

    @Test
    public void test1() {
        int n = 2;
        int resul = solution.fib(n);
        Assert.assertEquals(1, resul);
    }

    @Test
    public void test2() {
        int n = 3;
        int resul = solution.fib(n);
        Assert.assertEquals(2, resul);
    }

    @Test
    public void test3() {
        int n = 4;
        int resul = solution.fib(n);
        Assert.assertEquals(3, resul);
    }
}
