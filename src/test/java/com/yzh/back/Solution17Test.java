package com.yzh.back;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 17.电话号码的字母组合
 * 给定一个仅包含数字 2-9 的字符串,返回所有它能表示的字母组合。答案可以按 任意顺序 返回
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Solution17.class})
public class Solution17Test {

    @InjectMocks
    private Solution17 solution;

    @Test
    public void test1() {
        String digits = "23";
        List<String> result = solution.letterCombinations(digits);
        System.out.println(result.toString());
        Assert.assertEquals(9, result.size());
    }

    @Test
    public void test2() {
        String digits = "";
        List<String> result = solution.letterCombinations(digits);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void test3() {
        String digits = "2";
        List<String> result = solution.letterCombinations(digits);
        //System.out.println(result.toString());
        Assert.assertEquals(3, result.size());
    }
}
