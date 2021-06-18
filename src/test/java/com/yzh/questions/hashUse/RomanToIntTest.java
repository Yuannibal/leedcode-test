package com.yzh.questions.hashUse;

import org.junit.Assert;
import org.junit.Test;

/**
 * 13. 罗马数字转整数
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 */
public class RomanToIntTest {

    @Test
    public void test_1() {
        String s = "III";
        Assert.assertEquals(3, new RomanToInt().romanToInt1(s));
        Assert.assertEquals(3, new RomanToInt().romanToInt2(s));
    }

    @Test
    public void test_2() {
        String s = "IV";
        Assert.assertEquals(4, new RomanToInt().romanToInt1(s));
        Assert.assertEquals(4, new RomanToInt().romanToInt2(s));
    }

    @Test
    public void test_3() {
        String s = "IX";
        Assert.assertEquals(9, new RomanToInt().romanToInt1(s));
        Assert.assertEquals(9, new RomanToInt().romanToInt2(s));
    }

    @Test
    public void test_4() {
        String s = "LVIII";
        Assert.assertEquals(58, new RomanToInt().romanToInt1(s));
        Assert.assertEquals(58, new RomanToInt().romanToInt2(s));
    }

    @Test
    public void test_5() {
        String s = "MCMXCIV";
        Assert.assertEquals(1994, new RomanToInt().romanToInt1(s));
        Assert.assertEquals(1994, new RomanToInt().romanToInt2(s));
    }

}