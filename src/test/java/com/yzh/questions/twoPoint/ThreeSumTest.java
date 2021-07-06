package com.yzh.questions.twoPoint;

import java.util.List;
import org.junit.Test;

/**
 * 三数之和
 *
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 */
public class ThreeSumTest {

    @Test
    public void test_1() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = new ThreeSum().threeSum(nums);
        (new ThreeSum().threeSum(nums)).forEach(list -> System.out.println(list.toString()));
        System.out.println();
    }

    @Test
    public void test_2() {
        int[] nums = {};
        (new ThreeSum().threeSum(nums)).forEach(list -> System.out.println(list.toString()));
        System.out.println();
    }

    @Test
    public void test_3() {
        int[] nums = {0};
        (new ThreeSum().threeSum(nums)).forEach(list -> System.out.println(list.toString()));
        System.out.println();
    }

    @Test
    public void test_4() {
        int[] nums = {0, 0, 0, 0};
        (new ThreeSum().threeSum(nums)).forEach(list -> System.out.println(list.toString()));
        System.out.println();
    }

    @Test
    public void test_5() {
        int[] nums = {-2, 0, 0, 2, 2};
        (new ThreeSum().threeSum(nums)).forEach(list -> System.out.println(list.toString()));
        System.out.println();
    }
}