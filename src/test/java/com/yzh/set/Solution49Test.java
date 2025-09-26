package com.yzh.set;

import com.yzh.map.Solution49;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 49.字母异位词分组
 * 给你一个字符串数组,请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Solution49.class})
public class Solution49Test {

    @InjectMocks
    private Solution49 solution;

    @Test
    public void test1() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(strs);
        Assert.assertEquals(3, result.size());
    }

    @Test
    public void test2() {
        String[] strList = {""};
        List<List<String>> result = solution.groupAnagrams(strList);
        Assert.assertEquals(1, result.size());
    }

    @Test
    public void test3() {
        String[] strList = {"a"};
        List<List<String>> result = solution.groupAnagrams(strList);
        Assert.assertEquals(1, result.size());
    }

    @Test
    public void test4() {
        String[] strList = {"", "b", ""};
        List<List<String>> result = solution.groupAnagrams(strList);
        Assert.assertEquals(2, result.size());
    }
}
