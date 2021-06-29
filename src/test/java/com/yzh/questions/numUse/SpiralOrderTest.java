package com.yzh.questions.numUse;

import org.junit.Assert;
import org.junit.Test;

/**
 * 54. 螺旋矩阵
 * 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素
 */
public class SpiralOrderTest {

    @Test
    public void test_1() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 6, 9, 8, 7, 4, 5},
                new SpiralOrder().spiralOrder(matrix).toArray());
    }

    @Test
    public void test_2() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7},
                new SpiralOrder().spiralOrder(matrix).toArray());
    }
}