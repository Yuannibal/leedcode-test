package com.yzh.questions.treeNodeUse;

import com.yzh.entity.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 * 94. 二叉树的中序遍历
 * 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
 */
public class InorderTraversalTest {

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2, new TreeNode(3), null)
        );

        List<Integer> result = (new InorderTraversal()).inorderTraversal(root);
        result.forEach(item -> System.out.print(item + " "));
        System.out.println();
        Assert.assertArrayEquals(new Integer[]{1, 3, 2}, result.toArray());
    }

    @Test
    public void test_2() {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);

        List<Integer> result = (new InorderTraversal()).inorderTraversal(root);
        result.forEach(item -> System.out.print(item + " "));
        System.out.println();
        Assert.assertArrayEquals(new Integer[]{2, 1}, result.toArray());
    }

    @Test
    public void test_3() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2));

        List<Integer> result = (new InorderTraversal()).inorderTraversal(root);
        result.forEach(item -> System.out.print(item + " "));
        System.out.println();
        Assert.assertArrayEquals(new Integer[]{1, 2}, result.toArray());
    }
}