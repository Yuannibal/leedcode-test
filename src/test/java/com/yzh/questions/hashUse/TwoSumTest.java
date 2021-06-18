package com.yzh.questions.hashUse;


import org.junit.Assert;
import org.junit.Test;

/**
 * 1. 两数之和
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 */
public class TwoSumTest {

    @Test
    public void test_1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Assert.assertArrayEquals(new int[]{0, 1}, new TwoSum().twoSum(nums, target));
    }

    @Test
    public void test_2() {
        int[] nums = {3, 2, 4};
        int target = 6;

        Assert.assertArrayEquals(new int[]{1, 2}, new TwoSum().twoSum(nums, target));
    }

    @Test
    public void test_3() {
        int[] nums = {3, 3};
        int target = 6;

        Assert.assertArrayEquals(new int[]{0, 1}, new TwoSum().twoSum(nums, target));
    }
}