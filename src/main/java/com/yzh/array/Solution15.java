package com.yzh.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15.三数之和
 * 给你一个整数数组 nums,找出三元组 [nums[i], nums[j], nums[k]]
 * 满足 nums[i] + nums[j] + nums[k] == 0;满足 i != j、i != k 且 j != k;不重复的三元组
 */
public class Solution15 {

    /**
     * 三数之和--暴力迭代
     * 思路: 排序+同值跳过 可以避免值相同的情况
     *
     * @param nums 数据
     * @result 结果集合
     */
    public List<List<Integer>> threeSum1(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                for (int k = j + 1; k < nums.length; k++) {
                    if (k > j + 1 && nums[k] == nums[k - 1]) {
                        continue;
                    }
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }
        return result;
    }
}
