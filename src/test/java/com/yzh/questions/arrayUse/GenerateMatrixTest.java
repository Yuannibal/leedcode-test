package com.yzh.questions.arrayUse;

import org.junit.Assert;
import org.junit.Test;

/**
 * 59. 螺旋矩阵 II
 * 给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
 */
public class GenerateMatrixTest {

    @Test
    public void test_1() {
        int n = 3;
        int result[][] = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        Assert.assertArrayEquals(result, new GenerateMatrix().generateMatrix(n));
    }

    @Test
    public void test_2() {
        int n = 1;
        int result[][] = {{1}};
        Assert.assertArrayEquals(result, new GenerateMatrix().generateMatrix(n));
    }
}