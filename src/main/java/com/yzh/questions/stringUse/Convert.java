package com.yzh.questions.stringUse;

import java.util.ArrayList;
import java.util.List;

/**
 * 6. Z 字形变换
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
 */
public class Convert {

    /**
     * 方法一：用List保存结果
     */
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        List<List<Character>> record = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            List<Character> list = new ArrayList<>();
            record.add(list);
        }

        int index = 0;
        while (index < s.length()) {
            if (index % (2 * numRows - 2) <= numRows - 1) {
                record.get(index % (2 * numRows - 2)).add(s.charAt(index));
            } else {
                record.get(2 * (numRows - 1) - (index % (2 * numRows - 2))).add(s.charAt(index));
            }
            index++;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (Character character : record.get(i)) {
                stringBuilder.append(character);
            }
        }
        return stringBuilder.toString();
    }
}
