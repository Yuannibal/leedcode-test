package com.yzh.questions.hashUse;

import java.util.HashSet;
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

    /**
     * 方法一:HashSet
     */
    public boolean isValidSudoku1(char[][] board) {
        Set<Integer> set = new HashSet<>();
        return true;
    }
}
