package com.yzh.questions.twoPoint;

import org.junit.Assert;
import org.junit.Test;

/**
 * 16. 最接近的三数之和
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。
 * 返回这三个数的和。假定每组输入只存在唯一答案。
 */
public class ThreeSumClosestTest {

    @Test
    public void test_1() {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        Assert.assertEquals(2, new ThreeSumClosest().threeSumClosest(nums, target));
    }

    @Test
    public void test_2() {
        int[] nums = {0, 1, 2};
        int target = 0;
        Assert.assertEquals(3, new ThreeSumClosest().threeSumClosest(nums, target));
    }

    @Test
    public void test_3() {
        int[] nums = {-3, -2, -5, 3, -4};
        int target = -1;
        Assert.assertEquals(-2, new ThreeSumClosest().threeSumClosest(nums, target));
    }

    @Test
    public void test_4() {
        int[] nums = {1, 1, 1, 0};
        int target = -100;
        Assert.assertEquals(2, new ThreeSumClosest().threeSumClosest(nums, target));
    }
}