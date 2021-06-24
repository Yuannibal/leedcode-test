package com.yzh.questions.twoPoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 *
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 */
public class ThreeSum {

    /**
     * 排序 + 双指针
     * 与两数之和的思路天差地别
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            // 需要和上一次枚举的数不相同
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] == -nums[i]) { // 不要break; 还有其他情况
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    if (left < right) {
                        right--;
                    }
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    if (left < right) {
                        left++;
                    }
                } else if (nums[left] + nums[right] > -nums[i]) {
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    if (left < right) {
                        right--;
                    }
                } else {  // nums[left] + nums[right] < -nums[i]
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    if (left < right) {
                        left++;
                    }
                }
            }
        }
        return result;
    }
}
