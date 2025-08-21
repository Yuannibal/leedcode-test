package com.yzh.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.两数之和
 * 给定一个整数数组nums和一个整数目标值target,请你在该数组中找出和为目标值target的那两个整数,并返回它们的数组下标
 * 假设每种输入只会对应一个答案,并且你不能使用两次相同的元素
 */
public class Solution1 {

    /**
     * 两数之和
     * 思路: 每种输入只会对应一个答案--可以用Map
     *
     * @param nums 数组
     * @param target 目标值
     * @result 数组下标
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
