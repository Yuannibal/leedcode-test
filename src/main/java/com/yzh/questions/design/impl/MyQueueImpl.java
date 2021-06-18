package com.yzh.questions.design.impl;

import com.yzh.questions.design.MyQueue;
import java.util.Stack;

/**
 * 232. 用栈实现队列
 * 请你仅使用两个栈实现先入先出队列。队列应当支持一般队列支持的所有操作
 */
public class MyQueueImpl implements MyQueue {

    private final Stack<Integer> inStack;
    private final Stack<Integer> outStack;

    public MyQueueImpl() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    @Override
    public void push(int x) {
        // 如果元素为null，则发生NullPointException,如果栈空间受到限制,则发生IllegalStateException
        inStack.push(x);
    }

    @Override
    public int pop() {
        in2out();
        // pop 如果队列无元素,则发生NoSuchElementException
        return outStack.pop();
    }

    private void in2out() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                // pop 如果队列无元素,则发生NoSuchElementException
                outStack.push(inStack.pop());
            }
        }
    }

    @Override
    public int peek() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        // peek 如果队列无元素,则返回null
        return outStack.peek();
    }

    @Override
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }
}
