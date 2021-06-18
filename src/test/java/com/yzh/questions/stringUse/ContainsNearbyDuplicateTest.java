package com.yzh.questions.stringUse;

import org.junit.Assert;
import org.junit.Test;

/**
 * 219. 存在重复元素 II
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k。
 */
public class ContainsNearbyDuplicateTest {

    @Test
    public void test_1() {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        Assert.assertTrue((new ContainsNearbyDuplicate()).containsNearbyDuplicate1(nums, k));
        Assert.assertTrue((new ContainsNearbyDuplicate()).containsNearbyDuplicate2(nums, k));
    }

    @Test
    public void test_2() {
        int[] nums = {1, 0, 1, 1};
        int k = 1;
        Assert.assertTrue((new ContainsNearbyDuplicate()).containsNearbyDuplicate1(nums, k));
        Assert.assertTrue((new ContainsNearbyDuplicate()).containsNearbyDuplicate2(nums, k));
    }

    @Test
    public void test_3() {
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        Assert.assertFalse((new ContainsNearbyDuplicate()).containsNearbyDuplicate1(nums, k));
        Assert.assertFalse((new ContainsNearbyDuplicate()).containsNearbyDuplicate2(nums, k));
    }
}