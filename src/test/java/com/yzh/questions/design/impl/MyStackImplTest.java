package com.yzh.questions.design.impl;


import com.yzh.questions.design.MyStack;
import org.junit.Assert;
import org.junit.Test;

/**
 * 225. 用队列实现栈
 * 请你仅使用两个队列实现一个后入先出（LIFO）的栈
 */
public class MyStackImplTest {

    @Test
    public void test_1() {
        MyStack myStack = new MyStackImpl();

        myStack.push(1);
        myStack.push(2);

        Assert.assertEquals(2, myStack.top());
        Assert.assertEquals(2, myStack.pop());
        Assert.assertFalse(myStack.empty());
    }

    @Test
    public void test_2() {
        MyStack myStack = new MyStackImpl();

        myStack.push(1);
        myStack.push(2);

        Assert.assertEquals(2, myStack.pop());
        Assert.assertEquals(1, myStack.top());
        Assert.assertFalse(myStack.empty());
    }

    @Test
    public void test_3() {
        MyStack myStack = new MyStackImpl();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        Assert.assertEquals(3, myStack.top());
        Assert.assertEquals(3, myStack.pop());
        Assert.assertEquals(2, myStack.top());
        Assert.assertEquals(2, myStack.pop());
        Assert.assertEquals(1, myStack.top());
        Assert.assertFalse(myStack.empty());
        Assert.assertEquals(1, myStack.pop());
        Assert.assertTrue(myStack.empty());
    }
}