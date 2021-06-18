package com.yzh.questions.binarySearch;

/**
 * 69. x 的平方根
 * 实现 int sqrt(int x) 函数。
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 */
public class MySqrt {

    /**
     * 二分查找
     * 插入的位置 pos，它成立的条件为：result * result <= x < (result + 1) * (result + 1)
     * 在一个有序数组中找第一个小于等于 result的值
     *
     * 时间复杂度：O(log n)，其中 n 为数组的长度。二分查找所需的时间复杂度为 O(log n)
     * 空间复杂度：O(1)。我们只需要常数空间存放若干变量
     */
    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        int result = 0;

        // 用等号 mid可以取到边界值
        // 极端条件 mid == left == right  (1)left(变) > right(不变)  (2)right(变) < left(不变) (3)但是mid是可以选择让其不变的
        while (left <= right) {
            int mid = left + ((right - left) >> 1);

            long target = (long) mid * (long) mid;
            if (x == target) {
                return mid;
            } else if (x > target) {
                left = mid + 1;
                result = mid;
            } else {  // x < target
                right = mid - 1;
            }
        }

        return result;
    }
}
