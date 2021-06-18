package com.yzh.questions.game;

import org.junit.Assert;
import org.junit.Test;

/**
 * 292. Nim 游戏
 * 你和你的朋友，两个人一起玩 Nim 游戏：
 * * 桌子上有一堆石头。
 * * 你们轮流进行自己的回合，你作为先手。
 * * 每一回合，轮到的人拿掉 1 - 3 块石头。
 * * 拿掉最后一块石头的人就是获胜者。
 * 假设你们每一步都是最优解。
 * 请编写一个函数，来判断你是否可以在给定石头数量为 n 的情况下赢得游戏。如果可以赢，返回 true；否则，返回 false 。
 */
public class CanWinNimTest {

    /**
     * 如果堆中有 4 块石头，那么你永远不会赢得比赛；
     * 因为无论你拿走 1 块、2 块 还是 3 块石头，最后一块石头总是会被你的朋友拿走。
     */
    @Test
    public void test_1() {
        int n = 4;
        Assert.assertFalse(new CanWinNim().canWinNim(n));
    }

    @Test
    public void test_2() {
        int n = 1;
        Assert.assertTrue(new CanWinNim().canWinNim(n));
    }

    @Test
    public void test_3() {
        int n = 2;
        Assert.assertTrue(new CanWinNim().canWinNim(n));
    }
}