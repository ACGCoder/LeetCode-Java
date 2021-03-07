package top.acgcoder.leetcode.common;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class TreeNodeUtils {

    public static TreeNode arrayToTreeNode(Integer[] values) {
        if (values.length == 0) return null;
        ArrayDeque<TreeNode> nodeQueue = new ArrayDeque<>(values.length);
        ArrayDeque<String> valueQueue = Arrays.stream(values)
                .map(String::valueOf).collect(Collectors.toCollection(ArrayDeque::new));

        TreeNode treeNode = new TreeNode(Integer.parseInt(Objects.requireNonNull(valueQueue.poll())));
        TreeNode head = treeNode;
        nodeQueue.add(treeNode);

        while (!nodeQueue.isEmpty()) {
            treeNode = nodeQueue.poll();
            String value = valueQueue.poll();
            if (!"null".equals(value) && value != null) {
                treeNode.left = new TreeNode(Integer.parseInt(value));
                nodeQueue.add(treeNode.left);
            }
            value = valueQueue.poll();
            if (!"null".equals(value) && value != null){
                treeNode.right = new TreeNode(Integer.parseInt(value));
                nodeQueue.add(treeNode.right);
            }
        }
        return head;
    }
}
