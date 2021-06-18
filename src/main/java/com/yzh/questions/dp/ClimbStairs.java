package com.yzh.questions.dp;

/**
 * 70. 爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
public class ClimbStairs {

    /**
     * 方法一：递归
     *
     * 考虑最后一步可能跨了一级台阶，也可能跨了两级台阶
     * f(x) = f(x − 1) + f(x − 2)
     * 它意味着爬到第 xx 级台阶的方案数是爬到第 x - 1 级台阶的方案数和爬到第 x - 2 级台阶的方案数的和
     */
    public int climbStairs1(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        return climbStairs1(n - 2) + climbStairs1(n - 1);
    }

    /**
     * 方法二：动态规划
     */
    public int climbStairs2(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int result = 0;
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
}
