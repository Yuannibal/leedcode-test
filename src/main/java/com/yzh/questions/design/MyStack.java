package com.yzh.questions.design;

/**
 * 225. 用队列实现栈
 * 请你仅使用两个队列实现一个后入先出（LIFO）的栈
 */
public interface MyStack {

    /**
     * 将元素 x 压入栈顶
     */
    void push(int x);

    /**
     *  移除并返回栈顶元素
     */
    int pop();

    /**
     *  返回栈顶元素
     */
    int top();

    /**
     * 如果队列为空，返回 true ；否则，返回 false
     */
    boolean empty();
}
