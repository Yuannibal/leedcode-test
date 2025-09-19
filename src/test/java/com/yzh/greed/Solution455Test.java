package com.yzh.greed;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 455.分发饼干
 * 每个孩子 i,都有一个胃口值 g[i];每块饼干 j,都有一个尺寸 s[j];如果 s[j] >= g[i],我们可以将这个饼干j分配给孩子 i,这个孩子会得到满足
 * 你的目标是满足尽可能多的孩子,并输出这个最大数值
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Solution455.class})
public class Solution455Test {

    @InjectMocks
    private Solution455 solution;

    @Test
    public void test1() {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};

        int result = solution.findContentChildren(g, s);
        Assert.assertEquals(1, result);
    }

    @Test
    public void test2() {
        int[] g = {1, 2};
        int[] s = {1, 2, 3};

        int result = solution.findContentChildren(g, s);
        Assert.assertEquals(2, result);
    }
}
