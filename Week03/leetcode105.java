package com.wangjw.awake.algorithm.trainingCamp.week3;

import com.wangjw.awake.algorithm.trainingCamp.common.TreeNode;

/**
 * construct-binary-tree-from-preorder-and-inorder-traversal
 * 从前序与中序遍历序列构造二叉树
 */
public class leetcode105 {

    private int in = 0;
    private int pre = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, Integer.MAX_VALUE);
    }

    private TreeNode build(int[] preorder, int[] inorder, int stop) {
        if (pre >= preorder.length) {
            return null;
        }

        if (inorder[in] == stop) {
            in++;
            return null;
        }

        TreeNode node = new TreeNode(preorder[pre++]);
        node.left = build(preorder, inorder, node.val);
        node.right = build(preorder, inorder, stop);
        return node;
    }
}
