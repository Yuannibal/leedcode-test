package com.yzh.questions.hashUse;

import java.util.HashSet;
import java.util.Set;

/**
 * 349. 两个数组的交集
 * 给定两个数组，编写一个函数来计算它们的交集
 */
public class Intersection {

    /**
     * Set求交集
     */
    public int[] intersection1(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }

        set1.retainAll(set2);

        int[] result = new int[set1.size()];
        int i = 0;
        for (int num : set1) {
            result[i] = num;
            i++;
        }
        return result;
    }

    /**
     * 排序 + 双指针
     */

}
