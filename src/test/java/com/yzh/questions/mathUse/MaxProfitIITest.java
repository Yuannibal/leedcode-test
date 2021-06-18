package com.yzh.questions.mathUse;


import org.junit.Assert;
import org.junit.Test;

/**
 * 122. 买卖股票的最佳时机 II
 * 给定一个数组 prices ，其中 prices[i] 是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 */
public class MaxProfitIITest {

    @Test
    public void test_1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        Assert.assertEquals(7, (new MaxProfitII()).maxProfit(prices));
    }

    @Test
    public void test_2() {
        int[] prices = {1, 2, 3, 4, 5};
        Assert.assertEquals(4, (new MaxProfitII()).maxProfit(prices));
    }

    @Test
    public void test_3() {
        int[] prices = {7, 6, 4, 3, 1};
        Assert.assertEquals(0, (new MaxProfitII()).maxProfit(prices));
    }
}