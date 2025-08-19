package com.yzh.array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 463.岛屿的周长
 * 给定一个row x col 的二维网格地图grid; grid[i][j] = 1 表示陆地,grid[i][j] = 0 表示水域
 * 计算这个岛屿的周长
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Solution463.class})
public class Solution463Test {

    @InjectMocks
    private Solution463 solution;

    @Test
    public void test1() {
        int[][] nums = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        int result = solution.islandPerimeter(nums);
        Assert.assertEquals(16, result);
    }

    @Test
    public void test2() {
        int[][] nums = {{1}};
        int result = solution.islandPerimeter(nums);
        Assert.assertEquals(4, result);
    }

    @Test
    public void test3() {
        int[][] nums = {{1, 0}};
        int result = solution.islandPerimeter(nums);
        Assert.assertEquals(4, result);
    }

    @Test
    public void test4() {
        int[][] nums = {{0, 1}};
        int result = solution.islandPerimeter(nums);
        Assert.assertEquals(4, result);
    }
}
