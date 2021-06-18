package com.yzh.questions.twoPoint;

/**
 * 26. 删除有序数组中的重复项
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 */
public class RemoveDuplicates {

    /**
     * 方法一: 暴力法
     */
    public int removeDuplicates1(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int index = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[index] == nums[index + 1]) {
                for (int j = index + 1; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
            } else {
                index++;
            }
        }

        return index + 1;
    }

    /**
     * 方法二: 快慢指针
     * 时间复杂度：O(n)，其中 n 是数组的长度。快指针和慢指针最多各移动 n 次。
     * 空间复杂度：O(1)。只需要使用常数的额外空间。
     */
    public int removeDuplicates2(int[] nums) {
        int slow = 0;
        int fast = 0;

        while (fast < nums.length) {
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }

        return slow + 1;
    }
}
