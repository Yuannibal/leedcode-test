package com.yzh.questions.numUse;

/**
 * 171. Excel表列序号
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 */
public class TitleToNumber {

    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            result = 26 * result + ((int) columnTitle.charAt(i) - (int) 'A' + 1);
        }
        return result;
    }
}
