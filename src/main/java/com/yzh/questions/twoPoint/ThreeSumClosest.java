package com.yzh.questions.twoPoint;

import java.util.Arrays;

/**
 * 16. 最接近的三数之和
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。
 * 返回这三个数的和。假定每组输入只存在唯一答案。
 */
public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int result = 0;                // 结果
        int sub = Integer.MAX_VALUE;   // 差值
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (sub > Math.abs((nums[i] + nums[left] + nums[right]) - target)) {
                    result = nums[i] + nums[left] + nums[right];
                    sub = Math.abs((nums[i] + nums[left] + nums[right]) - target);
                }

                if ((nums[i] + nums[left] + nums[right]) == target) {
                    return target;
                } else if ((nums[i] + nums[left] + nums[right]) > target) {
                    right--;
                } else {  // (nums[i] + nums[left] + nums[right]) < target
                    left++;
                }
            }
        }
        return result;
    }
}
