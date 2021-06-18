package com.yzh.questions.twoPoint;

import org.junit.Assert;
import org.junit.Test;

/**
 * 283. 移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */
public class MoveZeroesTest {

    @Test
    public void test_11() {
        int[] nums = {0, 1, 0, 3, 12};
        (new MoveZeroes()).moveZeroes1(nums);
        Assert.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

    @Test
    public void test_21() {
        int[] nums = {0, 1, 0, 3, 12};
        (new MoveZeroes()).moveZeroes2(nums);
        Assert.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }
}