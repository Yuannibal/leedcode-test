package com.yzh.questions.stringUse;

import java.util.Set;
import java.util.TreeSet;

/**
 * 219. 存在重复元素 II
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k。
 */
public class ContainsNearbyDuplicate {

    /**
     * 方法一：线性搜索(滑动窗口)
     * 维护了一个 k 大小的滑动窗口，然后在这个窗口里面搜索是否存在跟当前元素相等的元素
     */
    public boolean containsNearbyDuplicate1(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j <= k && i + j < nums.length; j++) {
                if (nums[i] == nums[i + j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 方法二：散列表
     */
    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        Set<Integer> set = new TreeSet<>();      // HashSet也可以
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
                if (i - k >= 0) {
                    set.remove(nums[i - k]);
                }
            }
        }
        return false;
    }
}
