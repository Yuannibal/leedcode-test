package com.yzh.questions.binarySearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * 35. 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 */
public class SearchInsertTest {

    @Test
    public void test_1() {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        Assert.assertEquals(2, (new SearchInsert()).searchInsert(nums, target));
    }

    @Test
    public void test_2() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        Assert.assertEquals(1, (new SearchInsert()).searchInsert(nums, target));
    }

    @Test
    public void test_3() {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        Assert.assertEquals(4, (new SearchInsert()).searchInsert(nums, target));
    }

    @Test
    public void test_4() {
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        Assert.assertEquals(0, (new SearchInsert()).searchInsert(nums, target));
    }
}