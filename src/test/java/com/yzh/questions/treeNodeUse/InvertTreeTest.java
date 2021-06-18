package com.yzh.questions.treeNodeUse;

import com.yzh.entity.TreeNode;
import com.yzh.utils.TreeNodeUtils;
import org.junit.Test;

/**
 * 226. 翻转二叉树
 */
public class InvertTreeTest {

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(4
                , new TreeNode(2, new TreeNode(1), new TreeNode(3))
                , new TreeNode(7, new TreeNode(6), new TreeNode(9))
        );
        root = (new InvertTree()).invertTree(root);

        TreeNodeUtils.printBreadth(root);
        System.out.println();
    }
}