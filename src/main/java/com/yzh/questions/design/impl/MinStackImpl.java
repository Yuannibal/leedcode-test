package com.yzh.questions.design.impl;

import com.yzh.questions.design.MinStack;
import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * 155. 最小栈
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈
 */
public class MinStackImpl implements MinStack {

    /**
     * Deque是一个双端队列接口，继承自Queue接口，
     * Deque的实现类是LinkedList、ArrayDeque、LinkedBlockingDeque，其中LinkedList是最常用的
     */
    private final Deque<Integer> numStack;      // 存储数的栈
    private final Deque<Integer> minStack;      // 存储当前位置最小值的栈(所以两个栈的数量是一致的)

    public MinStackImpl() {
        numStack = new LinkedList<>();
        minStack = new LinkedList<>();
    }

    @Override
    public void push(int val) {
        // push 如果元素为null，则发生NullPointException,如果栈空间受到限制,则发生IllegalStateException
        numStack.push(val);

        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            minStack.push(Math.min(val, minStack.peek()));
        }
    }

    @Override
    public void pop() {
        // pop 如果队列无元素,则发生NoSuchElementException
        numStack.pop();
        minStack.pop();
    }

    @Override
    public int top() {
        if (numStack.isEmpty()) {
            throw new NoSuchElementException();
        } else {
            // 如果队列无元素,则返回null
            return numStack.peek();
        }
    }

    @Override
    public int getMin() {
        if (minStack.isEmpty()) {
            return Integer.MIN_VALUE;
        } else {
            // peek 如果队列无元素,则返回null
            return minStack.peek();
        }
    }
}
