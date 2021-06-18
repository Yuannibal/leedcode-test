package com.yzh.questions.bitCalculate;

import org.junit.Assert;
import org.junit.Test;

/**
 * 136. 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 */
public class SingleNumberTest {

    @Test
    public void test_1() {
        int[] nums = {2, 2, 1};
        Assert.assertEquals(1, (new SingleNumber()).singleNumber(nums));
    }

    @Test
    public void test_2() {
        int[] nums = {4, 1, 2, 1, 2};
        Assert.assertEquals(4, (new SingleNumber()).singleNumber(nums));
    }
}