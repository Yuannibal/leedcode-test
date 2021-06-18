package com.yzh.questions.twoPoint;

/**
 * 283. 移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */
public class MoveZeroes {

    /**
     * 方法一: 快慢双指针(一步一步移动)
     */
    public void moveZeroes1(int[] nums) {
        int slow = 0;
        int fast = 0;

        while (fast < nums.length) {
            if (0 != nums[fast]) {
                // 交换
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;

                slow++;
            }
            fast++;
        }
    }


    /**
     * 方法二: 快慢双指针(快速移动)
     */
    public void moveZeroes2(int[] nums) {
        int slow = 0;
        int fast = 0;

        while (fast < nums.length) {
            while (slow < nums.length && nums[slow] != 0) {
                slow++;
            }
            fast = slow;

            while (fast < nums.length && nums[fast] == 0) {
                fast++;
            }

            if (fast < nums.length && nums[slow] == 0 && nums[fast] != 0) {
                nums[slow] = nums[fast];
                nums[fast] = 0;
            }
        }
    }
}
