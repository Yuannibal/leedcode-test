package com.yzh.questions.hashUse;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 36. 有效的数独
 * 请你判断一个 9x9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。
 * (1)数字 1-9 在每一行只能出现一次。
 * (2)数字 1-9 在每一列只能出现一次。
 * (3)数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次
 *
 * 数独部分空格内已填入了数字，空白格用 '.' 表示
 */
public class IsValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        List<Set<Integer>> rows = new ArrayList<>();     // 行
        List<Set<Integer>> columns = new ArrayList<>();  // 列
        List<Set<Integer>> boxes = new ArrayList<>();    // 九宫格(从左向右排)
        for (int i = 0; i < 9; i++) {
            rows.add(new HashSet<>());
            columns.add(new HashSet<>());
            boxes.add(new HashSet<>());
        }

        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[0].length; column++) {
                if ((board[column][row] != '.')) {
                    if (!(rows.get(row).add((board[column][row]) - '0'))
                            || !(columns.get(column).add((board[column][row]) - '0'))
                            || !(boxes.get(((row / 3) * 3) + (column / 3)).add((board[column][row]) - '0'))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
