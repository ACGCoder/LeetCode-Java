package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution102;
import top.acgcoder.leetcode.common.TreeNode;

import java.util.*;

public class MySolution102 implements Solution102 {

    @Override
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return Collections.emptyList();

        List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> nodeQueue = new ArrayDeque<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            int levelCount = nodeQueue.size();
            List<Integer> levelResult = new ArrayList<>(levelCount);
            for (int i = 0; i < levelCount; i++) {
                TreeNode node = nodeQueue.poll();
                if (node != null) {
                    levelResult.add(node.val);
                    if (node.left != null) {
                        nodeQueue.add(node.left);
                    }
                    if (node.right != null) {
                        nodeQueue.add(node.right);
                    }
                }
            }
            result.add(levelResult);
        }
        return result;
    }
}
