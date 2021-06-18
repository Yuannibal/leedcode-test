package com.yzh.questions.numUse;


import org.junit.Assert;
import org.junit.Test;

/**
 * 168. Excel表列名称
 * 给定一个正整数，返回它在 Excel 表中相对应的列名称
 */
public class ConvertToTitleTest {

    @Test
    public void test_1() {
        int columnNumber = 1;
        Assert.assertEquals("A", new ConvertToTitle().convertToTitle(columnNumber));
    }

    @Test
    public void test_2() {
        int columnNumber = 28;
        Assert.assertEquals("AB", new ConvertToTitle().convertToTitle(columnNumber));
    }

    @Test
    public void test_3() {
        int columnNumber = 701;
        Assert.assertEquals("ZY", new ConvertToTitle().convertToTitle(columnNumber));
    }

}