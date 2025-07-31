package com.yzh.array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 704.二分查找
 * 给定一个n个元素有序的(升序)整型数组nums和一个目标值 target,写一个函数搜索nums中的target,如果目标值存在返回下标,否则返回 -1
 */
@RunWith(PowerMockRunner.class)
public class BinarySearchTest {

    @InjectMocks
    private BinarySearch binarySearch;

    @Test
    public void test1() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int result = binarySearch.search(nums, target);
        Assert.assertEquals(4, result);
    }

    @Test
    public void test2() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;

        int result = binarySearch.search(nums, target);
        Assert.assertEquals(-1, result);
    }
}
