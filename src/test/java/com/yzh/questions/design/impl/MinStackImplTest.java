package com.yzh.questions.design.impl;


import com.yzh.questions.design.MinStack;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: zihengyuan
 * @Date: 2021-05-21
 */
public class MinStackImplTest {

    @Test
    public void test_1() {
        MinStack minStack = new MinStackImpl();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        Assert.assertEquals(-3, minStack.getMin());

        minStack.pop();
        Assert.assertEquals(0, minStack.top());
        Assert.assertEquals(-2, minStack.getMin());
    }
}