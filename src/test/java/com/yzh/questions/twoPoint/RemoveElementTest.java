package com.yzh.questions.twoPoint;

import org.junit.Assert;
import org.junit.Test;

/**
 * 27. 移除元素
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */
public class RemoveElementTest {

    @Test
    public void test_11() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int len = (new RemoveElement()).removeElement1(nums, val);
        Assert.assertEquals(2, len);
        removeElementTest(nums, len);
    }

    @Test
    public void test_12() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int len = (new RemoveElement()).removeElement1(nums, val);
        Assert.assertEquals(5, len);
        removeElementTest(nums, len);
    }

    @Test
    public void test_13() {
        int[] nums = {1};
        int val = 1;
        int len = (new RemoveElement()).removeElement1(nums, val);
        Assert.assertEquals(0, len);
        removeElementTest(nums, len);
    }

    @Test
    public void test_14() {
        int[] nums = {};
        int val = 1;
        int len = (new RemoveElement()).removeElement1(nums, val);
        Assert.assertEquals(0, len);
        removeElementTest(nums, len);
    }

    @Test
    public void test_15() {
        int[] nums = {3, 3};
        int val = 3;
        int len = (new RemoveElement()).removeElement1(nums, val);
        Assert.assertEquals(0, len);
        removeElementTest(nums, len);
    }

    @Test
    public void test_21() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int len = (new RemoveElement()).removeElement2(nums, val);
        Assert.assertEquals(2, len);
        removeElementTest(nums, len);
    }

    @Test
    public void test_22() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int len = (new RemoveElement()).removeElement2(nums, val);
        Assert.assertEquals(5, len);
        removeElementTest(nums, len);
    }

    @Test
    public void test_23() {
        int[] nums = {1};
        int val = 1;
        int len = (new RemoveElement()).removeElement2(nums, val);
        Assert.assertEquals(0, len);
        removeElementTest(nums, len);
    }

    @Test
    public void test_24() {
        int[] nums = {};
        int val = 1;
        int len = (new RemoveElement()).removeElement2(nums, val);
        Assert.assertEquals(0, len);
        removeElementTest(nums, len);
    }

    @Test
    public void test_25() {
        int[] nums = {3, 3};
        int val = 3;
        int len = (new RemoveElement()).removeElement2(nums, val);
        Assert.assertEquals(0, len);
        removeElementTest(nums, len);
    }

    @Test
    public void test_31() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int len = (new RemoveElement()).removeElement3(nums, val);
        Assert.assertEquals(2, len);
        removeElementTest(nums, len);
    }

    @Test
    public void test_32() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int len = (new RemoveElement()).removeElement3(nums, val);
        Assert.assertEquals(5, len);
        removeElementTest(nums, len);
    }

    @Test
    public void test_33() {
        int[] nums = {1};
        int val = 1;
        int len = (new RemoveElement()).removeElement3(nums, val);
        Assert.assertEquals(0, len);
        removeElementTest(nums, len);
    }

    @Test
    public void test_34() {
        int[] nums = {};
        int val = 1;
        int len = (new RemoveElement()).removeElement3(nums, val);
        Assert.assertEquals(0, len);
        removeElementTest(nums, len);
    }

    @Test
    public void test_35() {
        int[] nums = {3, 3};
        int val = 3;
        int len = (new RemoveElement()).removeElement3(nums, val);
        Assert.assertEquals(0, len);
        removeElementTest(nums, len);
    }


    private void removeElementTest(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }


}