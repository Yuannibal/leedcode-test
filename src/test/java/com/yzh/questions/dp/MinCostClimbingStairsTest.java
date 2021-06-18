package com.yzh.questions.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * 746. 使用最小花费爬楼梯
 *
 * 数组的每个下标作为一个阶梯，第 i 个阶梯对应着一个非负数的体力花费值 cost[i]（下标从 0 开始）。
 * 每当你爬上一个阶梯你都要花费对应的体力值，一旦支付了相应的体力值，你就可以选择向上爬一个阶梯或者爬两个阶梯。
 * 请你找出达到楼层顶部的最低花费。在开始时，你可以选择从下标为 0 或 1 的元素作为初始阶梯。
 */
public class MinCostClimbingStairsTest {

    @Test
    public void test_1() {
        int[] cost = {10, 15, 20};
        Assert.assertEquals(15, (new MinCostClimbingStairs()).minCostClimbingStairs1(cost));
        Assert.assertEquals(15, (new MinCostClimbingStairs()).minCostClimbingStairs2(cost));
    }

    @Test
    public void test_2() {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        Assert.assertEquals(6, (new MinCostClimbingStairs()).minCostClimbingStairs1(cost));
        Assert.assertEquals(6, (new MinCostClimbingStairs()).minCostClimbingStairs2(cost));
    }

}