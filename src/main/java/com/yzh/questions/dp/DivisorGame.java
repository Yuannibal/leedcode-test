package com.yzh.questions.dp;

/**
 * 1025. 除数博弈
 *
 * 爱丽丝和鲍勃一起玩游戏，他们轮流行动。爱丽丝先手开局。
 * 最初，黑板上有一个数字 N 。在每个玩家的回合，玩家需要执行以下操作：
 * （1）选出任一 x，满足 0 < x < N 且 N % x == 0 。
 * （2）用 N - x 替换黑板上的数字 N 。
 * 如果玩家无法执行这些操作，就会输掉游戏。
 * 只有在爱丽丝在游戏中取得胜利时才返回 True，否则返回 False。假设两个玩家都以最佳状态参与游戏。
 */
public class DivisorGame {

    /**
     * 方法一：数学（反证法）
     * 奇数败，偶数胜。
     * 1. n = 1 和 n = 2 时结论成立。
     * 2. n > 2 时，假设 n <= k 时该结论成立，则 n = k + 1时：
     * (1)如果 k 为偶数，则 k + 1 为奇数，x 是 k + 1 的因数，只可能是奇数，而奇数减去奇数等于偶数，
     * 且 k + 1 - x <= k，故轮到 }Bob 的时候都是偶数。而根据我们的猜想假设 n<=k 的时候偶数的时候先手必胜，
     * 故此时无论Alice 拿走什么，Bob 都会处于必胜态，所以 Alice 处于必败态。
     *
     * (2)如果 k 为奇数，则 k + 1 为偶数，x 可以是奇数也可以是偶数，若 Alice 减去一个奇数，那么 k + 1 - x 是一个小于等于 k 的奇数，
     * 此时 Bob 占有它，处于必败态，则 Alice 处于必胜态。
     */
    public boolean divisorGame1(int n) {
        return n % 2 == 0;
    }

    /**
     * 方法二：动态规划
     */
    public boolean divisorGame2(int n) {
        boolean[] state = new boolean[n];   // 初始化的boolean数组都是false
        //state[0] = false;   // 数1 是 输

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i / 2 + 1; j++) {
                if (i % j == 0 && !state[i - j - 1]) {
                    state[i - 1] = true;
                    break;
                }
            }
        }
        return state[n - 1];
    }
}
