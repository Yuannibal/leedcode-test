package com.yzh.questions.treeNodeUse;

import com.yzh.entity.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 * 257. 二叉树的所有路径
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 */
public class BinaryTreePathsTest {

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(5)),
                new TreeNode(3)
        );
        List<String> result = (new BinaryTreePaths()).binaryTreePaths(root);
        result.forEach(System.out::println);
        System.out.println();
        Assert.assertEquals(2, result.size());
    }
}