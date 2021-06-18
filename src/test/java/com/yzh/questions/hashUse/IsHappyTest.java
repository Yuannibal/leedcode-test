package com.yzh.questions.hashUse;

import org.junit.Assert;
import org.junit.Test;

/**
 * 202. 快乐数
 * 「快乐数」定义为：
 *
 * 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
 * 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
 * 如果 可以变为  1，那么这个数就是快乐数。
 * 如果 n 是快乐数就返回 true ；不是，则返回 false 。
 */
public class IsHappyTest {

    @Test
    public void test_1() {
        int n = 19;
        Assert.assertTrue(new IsHappy().isHappy(n));
    }

    @Test
    public void test_2() {
        int n = 2;
        Assert.assertFalse(new IsHappy().isHappy(n));
    }
}