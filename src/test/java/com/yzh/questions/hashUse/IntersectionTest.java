package com.yzh.questions.hashUse;


import org.junit.Assert;
import org.junit.Test;

/**
 * 349. 两个数组的交集
 * 给定两个数组，编写一个函数来计算它们的交集
 */
public class IntersectionTest {

    @Test
    public void test_1() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        Assert.assertArrayEquals(new int[]{2}, new Intersection().intersection1(nums1, nums2));
    }

    @Test
    public void test_2() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        Assert.assertArrayEquals(new int[]{4, 9}, new Intersection().intersection1(nums1, nums2));
    }
}