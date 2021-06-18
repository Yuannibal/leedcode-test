package com.yzh.questions.treeNodeUse.search;

import com.yzh.entity.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * 501. 二叉搜索树中的众数
 * 给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）
 */
public class FindMode {

    /**
     * 中序遍历
     */
    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[]{};
        }

        List<Integer> values = new ArrayList<>();
        midTravel(root, values);

        // 这步可以在中序遍历中完成
        List<Integer> list = new ArrayList<>();
        int pre = values.get(0);
        list.add(pre);
        int cnt = 1;
        int max_cnt = 1;
        for (int i = 1; i < values.size(); i++) {
            if (values.get(i) == pre) {
                cnt++;
            } else {
                cnt = 1;
            }
            pre = values.get(i);

            if (cnt == max_cnt) {
                list.add(values.get(i));
            } else if (cnt > max_cnt) {
                max_cnt = cnt;
                list.clear();
                list.add(values.get(i));
            }
        }

        // 包装类的数组可以用List.toArray(new Object[List.size()]); 但是基本变量的数组只能遍历转换
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private void midTravel(TreeNode treeNode, List<Integer> list) {
        if (treeNode == null) {
            return;
        }
        midTravel(treeNode.left, list);
        list.add(treeNode.val);
        midTravel(treeNode.right, list);
    }
}
