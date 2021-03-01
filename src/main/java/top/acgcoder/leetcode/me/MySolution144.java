package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution144;
import top.acgcoder.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MySolution144 implements Solution144 {
    @Override
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null){
            return Collections.emptyList();
        } else {
            result.add(root.val);
            result.addAll(preorderTraversal(root.left));
            result.addAll(preorderTraversal(root.right));
        }
        return result;
    }
}
