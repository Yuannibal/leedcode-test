package com.yzh.questions.design;

/**
 * 155. 最小栈
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈
 */
public interface MinStack {

    /**
     * 将元素 x 推入栈中
     */
    void push(int val);

    /**
     * 删除栈顶的元素
     */
    void pop();

    /**
     * 获取栈顶元素
     */
    int top();

    /**
     * 检索栈中的最小元素
     */
    int getMin();
}
