package com.yzh.greed;

/**
 * 455.种花问题
 * 有一个很长的花坛,一部分地块种植了花,另一部分却没有;花不能种植在相邻的地块上,它们会争夺水源,两者都会死去
 * 给你一个整数数组flowerbed表示花坛,0:没种植花,1:种了花
 * 能否在不打破种植规则的情况下种入 n 朵花
 */
public class Solution605 {

    /**
     * 贪心
     * 技巧: 判断不能种比判断能种简单
     * @param flowerbed 花坛
     * @param n 剩余花朵
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if (i > 0 && flowerbed[i - 1] == 1) {
                    continue;
                }
                if (i < flowerbed.length - 1 && flowerbed[i + 1] == 1) {
                    continue;
                }
                flowerbed[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }
}
