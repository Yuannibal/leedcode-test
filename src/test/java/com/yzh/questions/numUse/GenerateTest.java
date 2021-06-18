package com.yzh.questions.numUse;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 * 118. 杨辉三角
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 */
public class GenerateTest {

    @Test
    public void test_1() {
        int numRows = 3;
        List<List<Integer>> result = new Generate().generate(numRows);
        Assert.assertEquals(numRows, result.size());

        result.forEach(col -> {
            col.forEach(val -> System.out.print(val + " "));
            System.out.println();
        });
        System.out.println();
    }

    @Test
    public void test_2() {
        int numRows = 5;
        List<List<Integer>> result = new Generate().generate(numRows);
        Assert.assertEquals(numRows, result.size());

        result.forEach(col -> {
            col.forEach(val -> System.out.print(val + " "));
            System.out.println();
        });
        System.out.println();
    }
}