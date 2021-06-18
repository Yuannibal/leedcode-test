package com.yzh.questions.numUse;

/**
 * 168. Excel表列名称
 * 给定一个正整数，返回它在 Excel 表中相对应的列名称
 */
public class ConvertToTitle {

    public String convertToTitle(int columnNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        while (columnNumber > 0) {
            // 小心: Excel中A对应的是1而不是0
            // 阿斯克码: A->65
            stringBuilder.insert(0, (char) ((columnNumber - 1) % 26 + ((int) 'A')));
            columnNumber = (columnNumber - 1) / 26;
        }
        return stringBuilder.toString();
    }
}
