package com.yzh.questions.numUse;

import java.util.ArrayList;
import java.util.List;

/**
 * 54. 螺旋矩阵
 * 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素
 */
public class SpiralOrder {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int rows = matrix.length;            // 行数
        int columns = matrix[0].length;      // 列数

        // 边界值
        int left = 0;
        int right = columns - 1;
        int top = 0;
        int bottom = rows - 1;

        int row;             // 行
        int column;          // 列
        while ((left <= right) && (top <= bottom)) {
            column = left;
            while (column <= right) {
                result.add(matrix[top][column]);
                column++;
            }
            top++;

            row = top;
            while (row <= bottom) {
                result.add(matrix[row][right]);
                row++;
            }
            right--;

            if ((left <= right) && (top <= bottom)) {
                column = right;
                while ((column >= left)) {
                    result.add(matrix[bottom][column]);
                    column--;
                }
                bottom--;

                row = bottom;
                while ((row >= top)) {
                    result.add(matrix[row][left]);
                    row--;
                }
                left++;
            }
        }
        return result;
    }
}
