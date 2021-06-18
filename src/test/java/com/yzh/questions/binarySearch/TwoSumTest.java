package com.yzh.questions.binarySearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * 167. 两数之和 II - 输入有序数组
 * 给定一个已按照 升序排列  的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数 target 。
 *
 * 函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。
 * numbers 的下标 从 1 开始计数 ，所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。
 *
 * 仅存在一个有效答案
 */
public class TwoSumTest {

    @Test
    public void test_1() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        Assert.assertArrayEquals(new int[]{1, 2}, (new TwoSum()).twoSum1(numbers, target));
        Assert.assertArrayEquals(new int[]{1, 2}, (new TwoSum()).twoSum2(numbers, target));
    }

    @Test
    public void test_2() {
        int[] numbers = {2, 3, 4};
        int target = 6;
        Assert.assertArrayEquals(new int[]{1, 3}, (new TwoSum()).twoSum1(numbers, target));
        Assert.assertArrayEquals(new int[]{1, 3}, (new TwoSum()).twoSum2(numbers, target));
    }

    @Test
    public void test_3() {
        int[] numbers = {-1, 0};
        int target = -1;
        Assert.assertArrayEquals(new int[]{1, 2}, (new TwoSum()).twoSum1(numbers, target));
        Assert.assertArrayEquals(new int[]{1, 2}, (new TwoSum()).twoSum2(numbers, target));
    }

    @Test
    public void test_4() {
        int[] numbers = {5,25,75};
        int target = 100;
        Assert.assertArrayEquals(new int[]{2, 3}, (new TwoSum()).twoSum1(numbers, target));
        Assert.assertArrayEquals(new int[]{2, 3}, (new TwoSum()).twoSum2(numbers, target));
    }
}