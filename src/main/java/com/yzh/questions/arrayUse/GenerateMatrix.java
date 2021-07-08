package com.yzh.questions.arrayUse;

/**
 * 59. 螺旋矩阵 II
 * 给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
 */
public class GenerateMatrix {

    public int[][] generateMatrix(int n) {
        int num = 1;
        int[][] result = new int[n][n];

        // 边界值
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;

        int row;             // 行
        int column;          // 列
        while (left <= right && top <= bottom) {
            column = left;
            while (column <= right) {
                result[top][column] = num;
                column++;
                num++;
            }
            top++;

            row = top;
            while (row <= bottom) {
                result[row][right] = num;
                row++;
                num++;
            }
            right--;

            if (left <= right && top < bottom) {
                column = right;
                while (column >= left) {
                    result[bottom][column] = num;
                    column--;
                    num++;
                }
                bottom--;

                row = bottom;
                while (row >= top) {
                    result[row][left] = num;
                    row--;
                    num++;
                }
                left++;
            }
        }
        return result;
    }
}
