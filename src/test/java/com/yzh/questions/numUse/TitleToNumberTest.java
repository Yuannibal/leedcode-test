package com.yzh.questions.numUse;


import org.junit.Assert;
import org.junit.Test;

/**
 * 171. Excel表列序号
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 */
public class TitleToNumberTest {

    @Test
    public void test_1() {
        String columnTitle = "A";
        Assert.assertEquals(1, new TitleToNumber().titleToNumber(columnTitle));
    }

    @Test
    public void test_2() {
        String columnTitle = "AB";
        Assert.assertEquals(28, new TitleToNumber().titleToNumber(columnTitle));
    }

    @Test
    public void test_3() {
        String columnTitle = "ZY";
        Assert.assertEquals(701, new TitleToNumber().titleToNumber(columnTitle));
    }
}