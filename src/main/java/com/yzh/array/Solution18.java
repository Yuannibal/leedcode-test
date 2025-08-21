package com.yzh.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15.四数之和
 * 给你一个整数数组 nums,找出三元组 [nums[a], nums[b], nums[c], nums[d]]
 * 满足 nums[a] + nums[b] + nums[c] + nums[d] == target; 要求不重复的四元组
 */
public class Solution18 {

    /**
     * 四数之和--排序+双指针
     * 思路: 双指针可以减少一层循环
     *
     * @param nums 数据
     * @param target 目标值
     * @result 结果集合
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int a = 0; a < nums.length - 3; a++) {
            if (a > 0 && nums[a] == nums[a - 1]) {
                continue;
            }
            for (int b = a + 1; b < nums.length - 2; b++) {
                if (b > a + 1 && nums[b] == nums[b - 1]) {
                    continue;
                }

                int left = b + 1;
                int right = nums.length - 1;
                while (left < right) {
                    if (left > b + 1 && nums[left] == nums[left - 1]) {
                        left++;
                        continue;
                    }
                    if (right < nums.length - 1 && nums[right] == nums[right + 1]) {
                        right--;
                        continue;
                    }

                    long num = (long) nums[a] + (long) nums[b] + (long) nums[left] + (long) nums[right];
                    if (num < target) {
                        left++;
                    } else if (num > target) {
                        right--;
                    } else {
                        result.add(Arrays.asList(nums[a], nums[b], nums[left], nums[right]));
                        left++;
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
