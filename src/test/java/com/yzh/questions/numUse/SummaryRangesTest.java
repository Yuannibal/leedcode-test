package com.yzh.questions.numUse;

import org.junit.Assert;
import org.junit.Test;

/**
 * 228. 汇总区间
 * 给定一个无重复元素的有序整数数组 nums
 *
 * 返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表。
 * 也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，并且不存在属于某个范围但不属于 nums 的数字 x 。
 */
public class SummaryRangesTest {

    @Test
    public void test_1() {
        int[] nums = {0, 1, 2, 4, 5, 7};
        Assert.assertArrayEquals(
                new String[]{"0->2", "4->5", "7"},
                new SummaryRanges().summaryRanges(nums).toArray()
        );
    }

    @Test
    public void test_2() {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};
        Assert.assertArrayEquals(
                new String[]{"0", "2->4", "6", "8->9"},
                new SummaryRanges().summaryRanges(nums).toArray()
        );
    }

    @Test
    public void test_3() {
        int[] nums = {};
        Assert.assertArrayEquals(
                new String[]{},
                new SummaryRanges().summaryRanges(nums).toArray()
        );
    }

    @Test
    public void test_4() {
        int[] nums = {-1};
        Assert.assertArrayEquals(
                new String[]{"-1"},
                new SummaryRanges().summaryRanges(nums).toArray()
        );
    }
}