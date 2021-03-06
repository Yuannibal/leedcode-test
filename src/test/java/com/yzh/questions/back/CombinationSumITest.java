package com.yzh.questions.back;

import java.util.List;
import org.junit.Test;

/**
 * 39. 组合总和
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * candidates 中的数字可以无限制重复被选取。
 *
 * 说明：
 * (1)所有数字（包括 target）都是正整数
 * (2)解集不能包含重复的组合。
 */
public class CombinationSumITest {

    @Test
    public void test_11() {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = new CombinationSumI().combinationSum1(candidates, target);
        result.forEach(list -> System.out.println(list.toString()));
        System.out.println();
    }

    @Test
    public void test_12() {
        int[] candidates = {2, 3, 5};
        int target = 8;

        List<List<Integer>> result = new CombinationSumI().combinationSum1(candidates, target);
        result.forEach(list -> System.out.println(list.toString()));
        System.out.println();
    }

    @Test
    public void test_21() {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = new CombinationSumI().combinationSum2(candidates, target);
        result.forEach(list -> System.out.println(list.toString()));
        System.out.println();
    }

    @Test
    public void test_22() {
        int[] candidates = {2, 3, 5};
        int target = 8;

        List<List<Integer>> result = new CombinationSumI().combinationSum2(candidates, target);
        result.forEach(list -> System.out.println(list.toString()));
        System.out.println();
    }
}