package com.yzh.questions.back;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
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
public class CombinationSumI {

    /**
     * 方法一. 双层递归
     */
    public List<List<Integer>> combinationSum1(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        combinationSum1(candidates, target, result, deque, 0);
        return result;
    }

    private void combinationSum1(int[] candidates, int target,
            List<List<Integer>> result, Deque<Integer> deque, int index) {
        if (index == candidates.length) {
            return;
        }

        if (target == 0) {
            result.add(new ArrayList<>(deque));
            return;
        }

        // 当前数递归（内层）
        if (target - candidates[index] >= 0) {
            deque.addLast(candidates[index]);
            combinationSum1(candidates, target - candidates[index], result, deque, index);
            deque.removeLast();
        }

        // 数组递归（外层）
        combinationSum1(candidates, target, result, deque, index + 1);
    }

    /**
     * 方法二. 循环 + 递归
     */
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        combinationSum2(candidates, target, result, deque, 0);
        return result;
    }

    private void combinationSum2(int[] candidates, int target,
            List<List<Integer>> result, Deque<Integer> deque, int index) {
        if (target == 0) {
            result.add(new ArrayList<>(deque));
            return;
        }

        for (int i = index; i < candidates.length && target >= candidates[i]; i++) {
            deque.addLast(candidates[i]);
            combinationSum2(candidates, target - candidates[i], result, deque, i);
            deque.removeLast();
        }
    }

}
