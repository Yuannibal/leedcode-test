package com.yzh.questions.back;

import java.util.List;
import org.junit.Test;

/**
 * 40. 组合总和 II
 * 给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * candidates 中的每个数字在每个组合中只能使用一次。
 * 注意：解集不能包含重复的组合。
 */
public class CombinationSum2Test {

    @Test
    public void test_1() {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        List<List<Integer>> result = new CombinationSum2().combinationSum(candidates, target);
        result.forEach(list -> System.out.println(list.toString()));
        System.out.println();
    }

    @Test
    public void test_2() {
        int[] candidates = {2, 5, 2, 1, 2};
        int target = 5;

        List<List<Integer>> result = new CombinationSum2().combinationSum(candidates, target);
        result.forEach(list -> System.out.println(list.toString()));
        System.out.println();
    }
}