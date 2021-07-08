package com.yzh.questions.arrayUse;

/**
 * 48. 旋转图像
 * 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 * 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
 */
public class Rotate {

    /**
     * 方法一：使用辅助数组
     * 第一行变成倒数第一列 ....
     * result[column][(rows - 1) - row] = matrix[row][column];
     */
    public void rotate(int[][] matrix) {
        int rows = matrix.length;            // 行数
        int columns = matrix[0].length;      // 列数

        // 辅助数组存储
        int[][] result = new int[rows][columns];
        for (int row = 0; row < rows; row++) {   // 行
            for (int column = 0; column < columns; column++) {  // 列
                result[column][(rows - 1) - row] = matrix[row][column];
            }
        }

        // 原数组赋值
        for (int row = 0; row < rows; row++) {   // 行
            for (int column = 0; column < columns; column++) {  // 列
                matrix[row][column] = result[row][column];
            }
        }
    }
}
