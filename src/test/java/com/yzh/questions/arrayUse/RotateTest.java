package com.yzh.questions.arrayUse;

import org.junit.Assert;
import org.junit.Test;

/**
 * 48. 旋转图像
 * 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 * 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
 */
public class RotateTest {

    @Test
    public void test_1() {
        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        (new Rotate()).rotate(matrix);
        Assert.assertArrayEquals(new int[][]{{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}}, matrix);
    }

    @Test
    public void test_2() {
        int[][] matrix = {{1}};
        (new Rotate()).rotate(matrix);
        Assert.assertArrayEquals(new int[][]{{1}}, matrix);
    }

    @Test
    public void test_3() {
        int[][] matrix = {{1, 2}, {3, 4}};
        (new Rotate()).rotate(matrix);
        Assert.assertArrayEquals(new int[][]{{3, 1}, {4, 2}}, matrix);
    }
}