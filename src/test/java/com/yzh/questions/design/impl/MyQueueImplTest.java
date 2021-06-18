package com.yzh.questions.design.impl;

import com.yzh.questions.design.MyQueue;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: zihengyuan
 * @Date: 2021-05-21
 */
public class MyQueueImplTest {

    @Test
    public void test_1() {
        MyQueue myQueue = new MyQueueImpl();

        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)

        Assert.assertEquals(1, myQueue.peek());
        Assert.assertEquals(1, myQueue.pop());

        Assert.assertFalse(myQueue.empty());
    }
}