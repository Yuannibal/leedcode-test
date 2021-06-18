package com.yzh.questions.twoPoint;

/**
 * 88. 合并两个有序数组
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。
 */
public class Merge {


    /**
     * 方法一：双指针 + 额外数组
     *
     * 时间复杂度：O(2(m+n))
     * 空间复杂度：O(m+n)
     */
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];

        int index0 = 0;
        int index1 = 0;
        int index2 = 0;
        while (index1 < m && index2 < n) {
            if (nums1[index1] <= nums2[index2]) {
                result[index0] = nums1[index1];
                index1++;
            } else {  // nums1[index1] > nums2[index2]
                result[index0] = nums2[index2];
                index2++;
            }
            index0++;
        }

        while (index1 < m) {
            result[index0] = nums1[index1];
            index1++;
            index0++;
        }

        while (index2 < n) {
            result[index0] = nums2[index2];
            index2++;
            index0++;
        }

        for (int i = 0; i < m + n; i++) {
            nums1[i] = result[i];
        }
    }

    /**
     * 方法二：逆向双指针
     */
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int index0 = m + n - 1;
        int index1 = m - 1;
        int index2 = n - 1;

        while (index1 >= 0 && index2 >= 0) {
            if (nums1[index1] <= nums2[index2]) {
                nums1[index0] = nums2[index2];
                index2--;
            } else {  // nums1[index1] > nums2[index2]
                nums1[index0] = nums1[index1];
                index1--;
            }
            index0--;
        }

        while (index1 >= 0) {
            nums1[index0] = nums1[index1];
            index1--;
            index0--;
        }

        while (index2 >= 0) {
            nums1[index0] = nums2[index2];
            index2--;
            index0--;
        }
    }
}
