package com.yzh.utils;


import com.yzh.entity.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class TreeNodeUtils {


    /**
     * 前序遍历打印
     */
    public static void printPre(TreeNode treeNode) {
        if (treeNode != null) {
            System.out.print(treeNode.val + " ");
            printPre(treeNode.left);
            printPre(treeNode.right);
        }
    }

    /**
     * 中序遍历打印
     */
    public static void printMid(TreeNode treeNode) {
        if (treeNode != null) {
            printMid(treeNode.left);
            System.out.print(treeNode.val + " ");
            printMid(treeNode.right);
        }
    }

    /**
     * 后序遍历打印
     */
    public static void printPost(TreeNode treeNode) {
        if (treeNode != null) {
            printPost(treeNode.left);
            printPost(treeNode.right);
            System.out.print(treeNode.val + " ");
        }
    }

    /**
     * 广度优先遍历
     */
    public static void printBreadth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            if (treeNode != null) {
                System.out.print(treeNode.val + " ");
                queue.offer(treeNode.left);
                queue.offer(treeNode.right);
            }
        }
    }

}
