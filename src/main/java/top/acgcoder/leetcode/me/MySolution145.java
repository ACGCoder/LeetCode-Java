package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution145;
import top.acgcoder.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MySolution145 implements Solution145 {
    @Override
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return Collections.emptyList();
        } else {
            result.addAll(postorderTraversal(root.left));
            result.addAll(postorderTraversal(root.right));
            result.add(root.val);
        }
        return result;
    }
}
