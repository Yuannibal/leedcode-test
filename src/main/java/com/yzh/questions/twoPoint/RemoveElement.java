package com.yzh.questions.twoPoint;

/**
 * 27. 移除元素
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */
public class RemoveElement {

    /**
     * 方法一：快慢指针
     * 频繁交换
     */
    public int removeElement1(int[] nums, int val) {
        int slow = 0;
        int fast = 0;

        while (fast < nums.length) {
            if (val != nums[fast]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        return slow;
    }

    /**
     * 方法二：左右指针(一步一步移动)
     */
    public int removeElement2(int[] nums, int val) {
        // 如果 int right = nums.length - 1 ;  那么下面就要用等号，因为返回数量，左右指针移动的长度要 nums.length次
        int left = 0;
        int right = nums.length;
        while (left < right) {
            if (val == nums[left]) {
                nums[left] = nums[right - 1];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }

    /**
     * 方法三：左右指针(快速移动)
     * 这种解法有问题
     */
    public int removeElement3(int[] nums, int val) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            // 左移(移到目标值)
            while (left < right && val != nums[left]) {
                left++;
            }

            // 右移动(移到非目标值)
            while (left < right && val == nums[right - 1]) {
                right--;
            }

            if (left < right && val == nums[left] && val != nums[right - 1]) {
                nums[left] = nums[right - 1];
                left++;
                right--;
            }
        }

        return left;
    }

}
