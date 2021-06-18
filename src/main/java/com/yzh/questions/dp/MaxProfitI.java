package com.yzh.questions.dp;

/**
 * 121. 买卖股票的最佳时机
 * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0
 */
public class MaxProfitI {

    /**
     * 动态规划
     *
     * f(i)表示以第i天为结尾时卖出股票获得的最大收入（差值）
     * 那么最后要求的是： f(i) = max{f(i)}    1 <= i < n
     *
     * f(i) = p[i] - minValue, 其中minValue表示以i结尾的前排数组的最小值
     */
    public int maxProfit(int[] prices) {
        int result = 0;
        int buyMin = Integer.MAX_VALUE;

        for (int price : prices) {
            buyMin = Math.min(buyMin, price);
            result = Math.max(result, price - buyMin);
        }

        return result;
    }
}
