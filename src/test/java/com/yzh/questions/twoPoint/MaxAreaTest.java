package com.yzh.questions.twoPoint;

import org.junit.Assert;
import org.junit.Test;

/**
 * 11. 盛最多水的容器
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 */
public class MaxAreaTest {

    @Test
    public void test_1() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        Assert.assertEquals(49, new MaxArea().maxArea(height));
    }

    @Test
    public void test_2() {
        int[] height = {1, 1};
        Assert.assertEquals(1, new MaxArea().maxArea(height));
    }

    @Test
    public void test_3() {
        int[] height = {4, 3, 2, 1, 4};
        Assert.assertEquals(16, new MaxArea().maxArea(height));
    }

    @Test
    public void test_4() {
        int[] height = {1, 2, 1};
        Assert.assertEquals(2, new MaxArea().maxArea(height));
    }

    @Test
    public void test_5() {
        int[] height = {1, 2, 4, 3};
        Assert.assertEquals(4, new MaxArea().maxArea(height));
    }

    @Test
    public void test_6() {
        int[] height = {1, 3, 2, 5, 25, 24, 5};
        Assert.assertEquals(24, new MaxArea().maxArea(height));
    }
}