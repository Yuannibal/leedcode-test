package com.yzh.questions.numUse;

import java.util.ArrayList;
import java.util.List;

/**
 * 228. 汇总区间
 * 给定一个无重复元素的有序整数数组 nums
 *
 * 返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表。
 * 也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，并且不存在属于某个范围但不属于 nums 的数字 x 。
 */
public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        if (nums.length == 1) {
            result.add(nums[0] + "");
            return result;
        }

        int slow = 0;
        int fast = 0;
        while (fast < nums.length - 1) {
            if (nums[fast] + 1 == nums[fast + 1]) {
                fast++;
            } else {
                if (slow == fast) {
                    result.add(nums[slow] + "");
                } else {
                    result.add(nums[slow] + "->" + nums[fast]);
                }
                fast++;
                slow = fast;
            }
        }

        // 判断最后一位
        if (nums[fast - 1] + 1 == nums[fast]) {
            result.add(nums[slow] + "->" + nums[fast]);
        } else {
            result.add(nums[slow] + "");
        }

        return result;
    }
}
