package com.yzh.questions.back;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

/**
 * 40. 组合总和 II
 * 给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * candidates 中的每个数字在每个组合中只能使用一次。
 * 注意：解集不能包含重复的组合。
 */
public class CombinationSumII {

    /**
     * 方法二. 循环 + 递归
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);    // 排序

        List<List<Integer>> result = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        combinationSum(candidates, target, result, deque, 0);
        return result;
    }

    private void combinationSum(int[] candidates, int target,
            List<List<Integer>> result, Deque<Integer> deque, int index) {
        if (target == 0) {
            result.add(new ArrayList<>(deque));
            return;
        }

        for (int i = index; i < candidates.length && target >= candidates[i]; ++i) {
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            deque.addLast(candidates[i]);
            combinationSum(candidates, target - candidates[i], result, deque, i + 1);
            deque.removeLast();
        }
    }
}
