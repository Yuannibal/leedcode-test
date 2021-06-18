package com.yzh.questions.dp;

/**
 * 746. 使用最小花费爬楼梯
 *
 * 数组的每个下标作为一个阶梯，第 i 个阶梯对应着一个非负数的体力花费值 cost[i]（下标从 0 开始）。
 * 每当你爬上一个阶梯你都要花费对应的体力值，一旦支付了相应的体力值，你就可以选择向上爬一个阶梯或者爬两个阶梯。
 * 请你找出达到楼层顶部的最低花费。在开始时，你可以选择从下标为 0 或 1 的元素作为初始阶梯。
 */
public class MinCostClimbingStairs {

    /**
     * 方法一：递归
     */
    public int minCostClimbingStairs1(int[] cost) {
        return minCostClimbingStairs1(cost, cost.length);
    }

    private int minCostClimbingStairs1(int[] cost, int length) {
        if (length == 0 || length == 1) {
            return 0;
        }

        if (length == 2) {
            return Math.min(cost[0], cost[1]);
        }

        return Math.min(
                cost[length - 1] + minCostClimbingStairs1(cost, length - 1),
                cost[length - 2] + minCostClimbingStairs1(cost, length - 2)
        );
    }

    /**
     * 方法二：动态规划
     *
     * 由于可以选择下标 0 或 1作为初始阶梯，因此有 dp[0]=dp[1]=0
     * 2 <= i<= n 时，可以从下标 i−1 使用 cost[i−1] 的花费达到下标 i，或者从下标 i−2 使用 cost[i−2] 的花费达到下标 i。
     * 了使总花费最小，dp[i] 应取上述两项的最小值，因此状态转移方程如下：dp[i] = min(dp[i−1]+cost[i−1],dp[i−2]+cost[i−2])
     *
     * 注意到当 2 <= i<= n 时，dp[i] 只和 p[i−1] 与 dp[i−2] 有关
     * 因此可以使用滚动数组的思想，将空间复杂度优化到 O(1)。
     */
    public int minCostClimbingStairs2(int[] cost) {
        int result = 0;
        int prev = 0;
        int curr = 0;
        for (int i = 2; i <= cost.length; i++) {
            result = Math.min(curr + cost[i - 1], prev + cost[i - 2]);
            prev = curr;
            curr = result;
        }
        return result;
    }
}
