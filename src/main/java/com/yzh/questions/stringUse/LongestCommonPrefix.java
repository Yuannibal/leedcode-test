package com.yzh.questions.stringUse;

/**
 * 14. 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class LongestCommonPrefix {

    /**
     * 方法一：纵向扫描(遍历)
     * 从前往后遍历所有字符串的每一列，比较相同列上的字符是否相同
     * 如果相同则继续对下一列进行比较
     * 如果不相同则当前列不再属于公共前缀，当前列之前的部分为最长公共前缀
     */
    public String longestCommonPrefix1(String[] sirs) {
        if (sirs == null || sirs.length == 0) {
            return "";
        }

        String str0 = sirs[0];
        for (int i = 0; i < str0.length(); i++) {
            for (int j = 1; j < sirs.length; j++) {
                if (i >= sirs[j].length() || str0.charAt(i) != sirs[j].charAt(i)) {
                    return str0.substring(0, i);
                }
            }
        }
        return str0;
    }

    /**
     * 方法二：横向扫描(递归)
     */
}
