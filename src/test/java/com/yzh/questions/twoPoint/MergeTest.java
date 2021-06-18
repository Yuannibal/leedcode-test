package com.yzh.questions.twoPoint;

import org.junit.Assert;
import org.junit.Test;

/**
 * 88. 合并两个有序数组
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。
 */
public class MergeTest {

    @Test
    public void test_11() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        (new Merge()).merge1(nums1, m, nums2, n);
        Assert.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    public void test_12() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;

        (new Merge()).merge1(nums1, m, nums2, n);
        Assert.assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    public void test_21() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        (new Merge()).merge2(nums1, m, nums2, n);
        Assert.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    public void test_22() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;

        (new Merge()).merge2(nums1, m, nums2, n);
        Assert.assertArrayEquals(new int[]{1}, nums1);
    }
}