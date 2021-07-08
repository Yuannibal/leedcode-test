package com.yzh.questions.hashUse;

import org.junit.Assert;
import org.junit.Test;

/**
 * 12. 整数转罗马数字
 * 罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边
 * 但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。
 * (1) I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * (2) X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
 * (3) C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 */
public class IntToRomanTest {

    @Test
    public void test_1() {
        int num = 3;
        Assert.assertEquals("III", new IntToRoman().intToRoman(num));
    }

    @Test
    public void test_2() {
        int num = 4;
        Assert.assertEquals("IV", new IntToRoman().intToRoman(num));
    }

    @Test
    public void test_3() {
        int num = 9;
        Assert.assertEquals("IX", new IntToRoman().intToRoman(num));
    }

    @Test
    public void test_4() {
        int num = 58;
        Assert.assertEquals("LVIII", new IntToRoman().intToRoman(num));
    }

    @Test
    public void test_5() {
        int num = 1994;
        Assert.assertEquals("MCMXCIV", new IntToRoman().intToRoman(num));
    }

}