package com.yzh.questions.twoPoint;

import org.junit.Assert;
import org.junit.Test;

/**
 * 26. 删除有序数组中的重复项
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 */
public class RemoveDuplicatesTest {

    @Test
    public void test_11() {
        int[] nums = {1, 1, 2};
        int len = (new RemoveDuplicates()).removeDuplicates1(nums);
        Assert.assertEquals(2, len);
        removeDuplicatesTest(nums, len);
    }

    @Test
    public void test_12() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len = (new RemoveDuplicates()).removeDuplicates1(nums);
        Assert.assertEquals(5, len);
        removeDuplicatesTest(nums, len);
    }

    @Test
    public void test_21() {
        int[] nums = {1, 1, 2};
        int len = (new RemoveDuplicates()).removeDuplicates2(nums);
        Assert.assertEquals(2, len);
        removeDuplicatesTest(nums, len);
    }

    @Test
    public void test_22() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len = (new RemoveDuplicates()).removeDuplicates1(nums);
        Assert.assertEquals(5, len);
        removeDuplicatesTest(nums, len);
    }

    private void removeDuplicatesTest(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

}