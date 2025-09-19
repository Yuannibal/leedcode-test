package com.yzh.greed;

import java.util.Arrays;

/**
 * 455.分发饼干
 * 每个孩子 i,都有一个胃口值 g[i];每块饼干 j,都有一个尺寸 s[j];如果 s[j] >= g[i],我们可以将这个饼干j分配给孩子 i,这个孩子会得到满足
 * 你的目标是满足尽可能多的孩子,并输出这个最大数值
 */
public class Solution455 {

    /**
     * 排序 + 双指针 + 贪心
     * @param g 孩子胃口
     * @param s 饼干尺寸
     * @result 最大满足数
     */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int result = 0;
        int i = 0;
        int j = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                i++;
                result++;
            }
            j++;
        }
        return result;
    }
}
