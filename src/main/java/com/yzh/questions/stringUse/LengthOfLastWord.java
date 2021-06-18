package com.yzh.questions.stringUse;

/**
 * 58. 最后一个单词的长度
 *
 * 给你一个字符串 s，由若干单词组成，单词之间用空格隔开。返回字符串中最后一个单词的长度。
 * 如果不存在最后一个单词，请返回 0 。
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        // 尾指针移动到第一个非' '处
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        if (end < 0) {
            return 0;
        }

        // 计算结果
        int result = 0;
        while (end >= 0 && s.charAt(end) != ' ') {
            result++;
            end--;
        }
        return result;
    }
}
