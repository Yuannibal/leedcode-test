package com.yzh.questions.treeNodeUse.search;


import com.yzh.entity.TreeNode;

/**
 * 108. 将有序数组转换为二叉搜索树
 *
 * 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
 * 高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。
 */
public class SortedArrayToBST {

    /**
     * 二叉搜索树的中序遍历是升序序列
     *
     * 我们可以选择中间数字作为二叉搜索树的根节点
     *  (1)如果数组长度是奇数，则根节点的选择是唯一的
     *  (2)如果数组长度是偶数，则可以选择中间位置左边的数字作为根节点或者选择中间位置右边的数字作为根节点
     * 确定平衡二叉搜索树的根节点之后，其余的数字分别位于平衡二叉搜索树的左子树和右子树中，左子树和右子树分别也是平衡二叉搜索树
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        } else {
            // 既可以选中间节点的左节点;也可选中间节点的右节点
            // (left + right) / 2  或  (left + right + 1) / 2

            int mid = left + (right - left) / 2;
            TreeNode treeNode = new TreeNode(nums[mid]);
            treeNode.left = sortedArrayToBST(nums, left, mid - 1);
            treeNode.right = sortedArrayToBST(nums, mid + 1, right);
            return treeNode;
        }
    }

}
