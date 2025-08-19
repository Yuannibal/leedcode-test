package com.yzh.array;

/**
 * 463.岛屿的周长
 * 给定一个row x col 的二维网格地图grid; grid[i][j] = 1 表示陆地,grid[i][j] = 0 表示水域
 * 计算这个岛屿的周长
 */
public class Solution463 {

    /**
     * 岛屿的周长
     * 方法:暴力迭代
     *
     * @param grid 图
     * @result 岛屿周长
     */
    public int islandPerimeter(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    if (i == 0 || grid[i - 1][j] == 0) {
                        result++;
                    }
                    if (i == grid.length - 1 || grid[i + 1][j] == 0) {
                        result++;
                    }
                    if (j == 0 || grid[i][j - 1] == 0) {
                        result++;
                    }
                    if (j == grid[i].length - 1 || grid[i][j + 1] == 0) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
