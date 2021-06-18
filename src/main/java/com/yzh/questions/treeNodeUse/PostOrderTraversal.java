package com.yzh.questions.treeNodeUse;

import com.yzh.entity.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * 145. 二叉树的后序遍历(左右中)
 * 给定一个二叉树，返回它的 后序 遍历。
 */
public class PostOrderTraversal {

    /**
     * 方法一：递归
     *
     * 时间复杂度：O(n)，其中 n 是二叉树的节点数。每一个节点恰好被遍历一次。
     * 空间复杂度：O(n)，为递归过程中栈的开销，平均情况下为 O(LogN)，最坏情况下树呈现链状，为 O(n)。
     */
    public List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postOrderTraversal(root, result);
        return result;
    }

    private void postOrderTraversal(TreeNode root, List<Integer> result) {
        if (root != null) {
            postOrderTraversal(root.right, result);
            postOrderTraversal(root.left, result);
            result.add(root.val);
        }
    }
}
