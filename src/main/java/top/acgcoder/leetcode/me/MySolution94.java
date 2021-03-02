package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution94;
import top.acgcoder.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MySolution94 implements Solution94 {
    @Override
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result;
        if (root == null) {
            return Collections.emptyList();
        } else {
            result = new ArrayList<>(inorderTraversal(root.left));
            result.add(root.val);
            result.addAll(inorderTraversal(root.right));
        }
        return result;
    }
}
