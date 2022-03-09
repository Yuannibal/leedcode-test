package com.yzh.questions.treeNodeUse;

import com.yzh.entity.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * 257. 二叉树的所有路径
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 */
public class BinaryTreePaths {

    /**
     * 方法一：深度优先搜索
     * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
     */
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        binaryTreePaths(root, result, "");
        return result;
    }

    private void binaryTreePaths(TreeNode treeNode, List<String> result, String str) {
        if (treeNode != null) {
            if (treeNode.left == null && treeNode.right == null) {  // 叶子节点
                result.add(str + treeNode.val);
            } else {
                binaryTreePaths(treeNode.left, result, str + treeNode.val + "->");
                binaryTreePaths(treeNode.right, result, str + treeNode.val + "->");
            }
        }
    }
}
