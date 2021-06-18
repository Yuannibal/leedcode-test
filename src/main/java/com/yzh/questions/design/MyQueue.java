package com.yzh.questions.design;

/**
 * 232. 用栈实现队列
 * 请你仅使用两个栈实现先入先出队列。队列应当支持一般队列支持的所有操作
 */
public interface MyQueue {

    /**
     * 将元素 x 推到队列的末尾
     */
    void push(int x);

    /**
     * 从队列的开头移除并返回元素
     */
    int pop();

    /**
     * 返回队列开头的元素
     */
    int peek();

    /**
     * 如果队列为空，返回 true ；否则，返回 false
     */
    boolean empty();
}
