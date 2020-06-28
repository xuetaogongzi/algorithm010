package com.wangjw.awake.algorithm.trainingCamp.week3;

import com.wangjw.awake.algorithm.trainingCamp.common.TreeNode;

/**
 * lowest-common-ancestor-of-a-binary-tree
 * 二叉树的最近公共祖先
 */
public class leetcode236 {

    // 递归
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        return left == null ? right : right == null ? left : root;
    }
}
