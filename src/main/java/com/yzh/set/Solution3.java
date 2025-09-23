package com.yzh.set;

import java.util.HashSet;
import java.util.Set;

/**
 * 3.无重复字符的最长子串
 * 给定一个字符串 s,请你找出其中不含有重复字符的 最长 子串 的长度。
 */
public class Solution3 {

    /**
     * 滑动窗口+Set
     *
     * @param s 输入字符串
     * @result 最长子串 长度
     */
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        Set<Character> set = new HashSet<>();

        int slow = 0;
        int fast = 0;
        while (fast < s.length()) {
            char c = s.charAt(fast);
            if (set.contains(c)) {
                result = Math.max(result, fast - slow);
                while (s.charAt(slow) != c) {
                    set.remove(s.charAt(slow));
                    slow++;
                }
                slow++;
            } else {
                set.add(c);
            }
            fast++;
        }
        return Math.max(result, fast - slow);
    }
}
