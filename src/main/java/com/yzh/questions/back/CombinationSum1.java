package com.yzh.questions.back;

import java.util.ArrayList;
import java.util.List;

/**
 * 39. 组合总和
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * candidates 中的数字可以无限制重复被选取。
 *
 * 说明：
 * (1)所有数字（包括 target）都是正整数
 * (2)解集不能包含重复的组合。
 */
public class CombinationSum1 {

    /**
     * 方法一. 递归
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        combinationSum(candidates, target, result, list, 0);
        return result;
    }

    private void combinationSum(int[] candidates, int target,
            List<List<Integer>> result, List<Integer> list, int index) {
        if (index == candidates.length) {
            return;
        }

        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }

        // 当前数递归（内层）
        if (target - candidates[index] >= 0) {
            list.add(candidates[index]);
            combinationSum(candidates, target - candidates[index], result, list, index);
            list.remove(list.size() - 1);
        }

        // 数组递归（外层）
        combinationSum(candidates, target, result, list, index + 1);
    }
}
