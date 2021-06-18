package com.yzh.questions.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * 70. 爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
public class ClimbStairsTest {

    @Test
    public void test_1() {
        int n = 2;
        Assert.assertEquals(2, (new ClimbStairs()).climbStairs1(n));
        Assert.assertEquals(2, (new ClimbStairs()).climbStairs2(n));
    }

    @Test
    public void test_2() {
        int n = 3;
        Assert.assertEquals(3, (new ClimbStairs()).climbStairs1(n));
        Assert.assertEquals(3, (new ClimbStairs()).climbStairs2(n));
    }
}