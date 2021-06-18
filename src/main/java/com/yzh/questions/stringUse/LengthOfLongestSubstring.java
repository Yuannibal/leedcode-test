package com.yzh.questions.stringUse;

import java.util.HashSet;
import java.util.Set;

/**
 * 3. 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        Set<Character> set = new HashSet<>();

        int slow = 0;
        int fast = 0;
        while (fast < s.length()) {
            if (set.contains(s.charAt(fast))) {
                while (s.charAt(slow) != s.charAt(fast)) {
                    set.remove(s.charAt(slow));
                    slow++;
                }
                slow++;
            } else {
                set.add(s.charAt(fast));
                result = Math.max(result, set.size());
            }
            fast++;
        }
        return result;
    }
}
