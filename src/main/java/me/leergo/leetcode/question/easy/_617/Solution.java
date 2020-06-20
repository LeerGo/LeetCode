package me.leergo.leetcode.question.easy._617;

class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        } else {
            int      val     = sumNode(t1, t2);
            TreeNode newNode = new TreeNode(val);

            newNode.left = mergeTrees(getLeft(t1), getLeft(t2));
            newNode.right = mergeTrees(getRight(t1), getRight(t2));
            return newNode;
        }
    }

    private TreeNode getLeft(TreeNode node) {
        return node == null ? null : node.left;
    }

    private TreeNode getRight(TreeNode node) {
        return node == null ? null : node.right;
    }

    private int sumNode(TreeNode t1, TreeNode t2) {
        return (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);
    }
}