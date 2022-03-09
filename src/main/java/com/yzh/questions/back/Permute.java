package com.yzh.questions.back;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * 46. 全排列
 *
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 */
public class Permute {

    /**
     * 回溯 + 栈 + 队列(保证顺序递进，但遍历一遍后不变)
     */
    public List<List<Integer>> permute1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Queue<Integer> output = new LinkedList<>();
        for (int num : nums) {
            output.add(num);
        }

        permute1(result, output, new Stack<>(), output.size(), 0);
        return result;
    }

    private void permute1(List<List<Integer>> result, Queue<Integer> output, Stack<Integer> input, int len, int n) {
        if (n == len) {
            result.add(new ArrayList<>(input));
            return;
        }

        for (int i = n; i < len; i++) {
            int num = output.remove();  // 队列是头出尾进
            input.push(num);     // 栈是投进头出
            permute1(result, output, input, len, n + 1);
            input.pop();         // 栈是投进头出
            output.offer(num);         // 队列是头出尾进
        }
    }

    /**
     * 回溯 + 链表交换
     */
    public List<List<Integer>> permute2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> output = new LinkedList<>();
        for (int num : nums) {
            output.add(num);
        }

        permute2(result, output, output.size(), 0);
        return result;
    }

    private void permute2(List<List<Integer>> result, List<Integer> output, int len, int n) {
        if (n == len) {
            result.add(new ArrayList<>(output));
            return;
        }

        for (int i = n; i < len; i++) {
            Collections.swap(output, n, i);            // 交换两个元素的位置
            permute2(result, output, len, n + 1);
            Collections.swap(output, n, i);            // 恢复回来
        }
    }
}
