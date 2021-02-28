package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution100;
import top.acgcoder.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class MySolution100 implements Solution100 {
    @Override
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<String> pList = preorderTraversal(p, new ArrayList<>(100));
        List<String> qList = preorderTraversal(q, new ArrayList<>(100));

        if (pList.size() != qList.size())
            return false;

        for (int i = 0; i < pList.size(); i++) {
            if (!pList.get(i).equals(qList.get(i))) {
                return false;
            }
        }
        return true;
    }

    private List<String> preorderTraversal(TreeNode treeNode, List<String> result) {
        if (treeNode == null) {
            result.add("null");
        } else {
            result.add(String.valueOf(treeNode.val));
            result = preorderTraversal(treeNode.left, result);
            result = preorderTraversal(treeNode.right, result);
        }
        return result;
    }
}
