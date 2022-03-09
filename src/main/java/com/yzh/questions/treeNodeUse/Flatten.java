package com.yzh.questions.treeNodeUse;

import com.yzh.entity.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 114. 二叉树展开为链表
 * 给你二叉树的根结点 root ，请你将它展开为一个单链表：
 * （1）展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null。
 * （2）展开后的单链表应该与二叉树 先序遍历 顺序相同。
 */
public class Flatten {

    /**
     * 方法一：前序遍历 + 借助List(存储再遍历)
     */
    public void flatten1(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        flatten1(root, list);

        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).left = null;
            list.get(i).right = list.get(i + 1);
        }
    }

    public void flatten1(TreeNode treeNode, List<TreeNode> list) {
        if (treeNode == null) {
            return;
        }

        list.add(treeNode);
        flatten1(treeNode.left, list);
        flatten1(treeNode.right, list);
    }

    /**
     * 方法二： 一遍遍历 + 借助栈
     */
    public void flatten2(TreeNode root) {
        if (root != null) {
            flatten2(root, new Stack<>());
        }
    }

    public TreeNode flatten2(TreeNode treeNode, Stack<TreeNode> preRightNodeStack) {
        if (treeNode.left == null && treeNode.right == null) {
            if (!preRightNodeStack.empty()) {
                treeNode.right = flatten2(preRightNodeStack.pop(), preRightNodeStack);
            }
        } else if (treeNode.left == null) {  // treeNode.left == null && treeNode.right != null
            treeNode.right = flatten2(treeNode.right, preRightNodeStack);
        } else if (treeNode.right == null) {  // treeNode.left != null && treeNode.right == null
            treeNode.right = flatten2(treeNode.left, preRightNodeStack);
            treeNode.left = null;
        } else {
            preRightNodeStack.push(treeNode.right);
            treeNode.right = flatten2(treeNode.left, preRightNodeStack);
            treeNode.left = null;
        }
        return treeNode;
    }

    /**
     * 方法三： 还有其他方法.....
     */
}
