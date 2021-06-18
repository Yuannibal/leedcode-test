package com.yzh.questions.binarySearch;

/**
 * 167. 两数之和 II - 输入有序数组
 * 给定一个已按照 升序排列  的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数 target 。
 *
 * 函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。
 * numbers 的下标 从 1 开始计数 ，所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。
 *
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素
 */
public class TwoSum {

    /**
     * 方法一: 二分查找
     *
     * 时间复杂度：O(log n)，其中 n 为数组的长度。二分查找所需的时间复杂度为 O(log n)
     * 空间复杂度：O(1)。我们只需要常数空间存放若干变量
     */
    public int[] twoSum1(int[] numbers, int target) {
        for (int index = 0; index < numbers.length - 1; index++) {
            int temp = target - numbers[index];

            int left = index + 1;
            int right = numbers.length - 1;
            while (left <= right) {    // 用等号 mid可以取到边界值
                int mid = left + ((right - left) >> 1);
                if (temp == numbers[mid]) {
                    return new int[]{index + 1, mid + 1};
                } else if (temp > numbers[mid]) {
                    left = mid + 1;
                } else {  // temp < numbers[mid]
                    right = mid - 1;
                }
            }
        }

        return new int[]{-1, -1};
    }


    public int[] twoSum2(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            if (target == numbers[left] + numbers[right]) {
                return new int[]{left + 1, right + 1};
            } else if (target < numbers[left] + numbers[right]) {
                right--;
            } else {  // target > numbers[left] + numbers[right]
                left++;
            }
        }

        return new int[]{-1, -1};
    }
}
