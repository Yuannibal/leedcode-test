package com.yzh.questions.hashUse;

import org.junit.Assert;
import org.junit.Test;

/**
 * 217. 存在重复元素
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 */
public class ContainsDuplicateTest {

    @Test
    public void test_1() {
        int[] nums = {1, 2, 3, 1};
        Assert.assertTrue((new ContainsDuplicate()).containsDuplicate1(nums));
        Assert.assertTrue((new ContainsDuplicate()).containsDuplicate2(nums));
    }

    @Test
    public void test_2() {
        int[] nums = {1, 2, 3, 4};
        Assert.assertFalse((new ContainsDuplicate()).containsDuplicate1(nums));
        Assert.assertFalse((new ContainsDuplicate()).containsDuplicate2(nums));
    }

    @Test
    public void test_3() {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        Assert.assertTrue((new ContainsDuplicate()).containsDuplicate1(nums));
        Assert.assertTrue((new ContainsDuplicate()).containsDuplicate2(nums));
    }
}