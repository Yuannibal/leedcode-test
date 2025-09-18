package com.yzh.recursion;

/**
 * 509.斐波那契数
 * F(0) = 0; F(1) = 1
 * F(n) = F(n - 1) + F(n - 2)
 * 给定 n ,请计算 F(n)
 */
public class Solution509 {

    /**
     * 递归法
     *
     * @param n 数据
     * @result 函数结果
     */
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
