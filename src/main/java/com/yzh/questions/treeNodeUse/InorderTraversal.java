package com.yzh.questions.treeNodeUse;

import com.yzh.entity.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历
 * 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
 */
public class InorderTraversal {

    /**
     * 方法一：递归
     *
     * 时间复杂度：O(n)，其中 n 为二叉树节点的个数。二叉树的遍历中每个节点会被访问一次且只会被访问一次。
     * 空间复杂度：O(n)。空间复杂度取决于递归的栈深度，而栈深度在二叉树为一条链的情况下会达到 O(n) 的级别。
     *
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        return inorderTraversal(root, new ArrayList<>());
    }

    private List<Integer> inorderTraversal(TreeNode treeNode, List<Integer> result) {
        if (null == treeNode) {
            return result;
        }
        inorderTraversal(treeNode.left, result);
        result.add(treeNode.val);
        inorderTraversal(treeNode.right, result);
        return result;
    }
}
