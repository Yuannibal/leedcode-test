package com.yzh.questions.back;

import java.util.List;
import org.junit.Test;

/**
 * 46. 全排列
 *
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 */
public class PermuteTest {

    @Test
    public void test_1() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new Permute().permute1(nums);
        result.forEach(list -> System.out.println(list.toString()));
        System.out.println();
    }

    @Test
    public void test_2() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new Permute().permute2(nums);
        result.forEach(list -> System.out.println(list.toString()));
        System.out.println();
    }
}