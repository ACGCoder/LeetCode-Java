package top.acgcoder.leetcode.common;

import java.util.ArrayDeque;
import java.util.Arrays;

public class TreeNodeUtils {
    private static ArrayDeque<String> queue;

    public static TreeNode arrayToTreeNode(String[] values) {
        queue = new ArrayDeque<>(values.length);
        queue.addAll(Arrays.asList(values));

        TreeNode treeNode = null;
        if (queue.peek() != null){
            treeNode = new TreeNode(Integer.parseInt(queue.poll()));
            constructTreeNode(treeNode);
        }
        return treeNode;
    }

    private static void constructTreeNode(TreeNode treeNode) {
        if (treeNode == null)
            return;

        if ("null".equals(queue.peek()))
            queue.poll();
        else if(queue.peek() != null)
            treeNode.left = new TreeNode(Integer.parseInt(queue.poll()));

        if ("null".equals(queue.peek()))
            queue.poll();
        else if(queue.peek() != null)
            treeNode.right = new TreeNode(Integer.parseInt(queue.poll()));

        constructTreeNode(treeNode.left);
        constructTreeNode(treeNode.right);
    }
}
