package com.yzh.questions.numUse;

import org.junit.Assert;
import org.junit.Test;

/**
 * 169. 多数元素
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class MajorityElementTest {

    @Test
    public void test_1() {
        int[] nums = {3, 2, 3};
        Assert.assertEquals(3, new MajorityElement().majorityElement(nums));
    }

    @Test
    public void test_2() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        Assert.assertEquals(2, new MajorityElement().majorityElement(nums));
    }
}