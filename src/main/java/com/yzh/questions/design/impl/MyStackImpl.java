package com.yzh.questions.design.impl;

import com.yzh.questions.design.MyStack;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 225. 用队列实现栈
 * 请你仅使用两个队列实现一个后入先出（LIFO）的栈
 */
public class MyStackImpl implements MyStack {

    private Queue<Integer> queueUse;   // 数据按先进后出的顺序放入其中
    private Queue<Integer> queueTemp;  // 作用一:数据刚进入时,存放在这里(里面存放一个元素) 作用二:暂时存放(最后交换指针，里面为null)

    public MyStackImpl() {
        queueUse = new LinkedList<>();
        queueTemp = new LinkedList<>();
    }


    @Override
    public void push(int x) {
        // offer添加一个元素，如果因为容量限制添加失败了，则抛出IllegalStateException异常
        // add添加一个元素，无法添加元素则，返回false
        queueTemp.offer(x);

        while (!queueUse.isEmpty()) {
            queueTemp.offer(queueUse.remove());
        }

        Queue<Integer> temp = queueTemp;
        queueTemp = queueUse;
        queueUse = temp;
    }

    @Override
    public int pop() {
        //poll获取并移除此队列的头，如果此队列为空，则返回 null
        //remove获取并移除此队列的头，如果此队列为空，那么remove方法将抛出NoSuchElementException异常
        return queueUse.remove();
    }

    @Override
    public int top() {
        //peek返回队列的头元素，如果此队列为空，则返回 null
        //element返回队列的头元素，如果此队列为空，那么remove方法将抛出NoSuchElementException异常
        return queueUse.element();
    }

    @Override
    public boolean empty() {
        return queueUse.isEmpty();
    }
}
