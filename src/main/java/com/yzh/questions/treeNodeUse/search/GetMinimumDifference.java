package com.yzh.questions.treeNodeUse.search;

import com.yzh.entity.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * 530. 二叉搜索树的最小绝对差
 * 给你一棵所有节点为非负值的二叉搜索树，请你计算树中任意两节点的差的绝对值的最小值。
 */
public class GetMinimumDifference {

    /**
     * 方法一：递归
     */
    public int getMinimumDifference1(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        if (root.left != null && root.right != null) {
            return Math.min(
                    Math.min(root.val - getRightDepthVale(root.left), getLeftDepthVale(root.right) - root.val),
                    Math.min(getMinimumDifference1(root.left), getMinimumDifference1(root.right))
            );
        } else if (root.left != null) { // root.left != null && root.right == null
            return Math.min(
                    root.val - getRightDepthVale(root.left),
                    getMinimumDifference1(root.left)
            );
        } else if (root.right != null) { // root.left == null && root.right != null
            return Math.min(
                    getLeftDepthVale(root.right) - root.val,
                    getMinimumDifference1(root.right)
            );
        } else { // root.left == null && root.right == null
            return Integer.MAX_VALUE;
        }
    }

    /**
     * 寻找最左边的值
     */
    private int getLeftDepthVale(TreeNode treeNode) {
        if (treeNode.left == null) {
            return treeNode.val;
        } else {
            return getLeftDepthVale(treeNode.left);
        }
    }

    /**
     * 寻找最右边的值
     */
    private int getRightDepthVale(TreeNode treeNode) {
        if (treeNode.right == null) {
            return treeNode.val;
        } else {
            return getRightDepthVale(treeNode.right);
        }
    }

    /**
     * 方法二：中序遍历 + List
     */
    public int getMinimumDifference2(TreeNode root) {
        List<Integer> record = new ArrayList<>();
        saveByMidTraversal(root, record);

        if (record.size() <= 1) {
            return Integer.MAX_VALUE;
        }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < record.size() - 1; i++) {
            result = Math.min(result, record.get(i + 1) - record.get(i));
        }
        return result;
    }

    /**
     * 中序遍历保存数值
     */
    private void saveByMidTraversal(TreeNode treeNode, List<Integer> record) {
        if (treeNode != null) {
            saveByMidTraversal(treeNode.left, record);
            record.add(treeNode.val);
            saveByMidTraversal(treeNode.right, record);
        }
    }
}
