package top.acgcoder.leetcode.common;

public class TreeNodeUtils {
    public static TreeNode arrayToTreeNode(String[] nums) {
        TreeNode treeNode = new TreeNode();
        int index = 0;
        index = constructTreeNode(nums, treeNode, index);
        index = constructTreeNode(nums, treeNode.left, index);
        constructTreeNode(nums, treeNode.right, index);
        return treeNode;
    }

    private static int constructTreeNode(String[] nums, TreeNode treeNode, int index) {
        if (index >= nums.length || "null".equals(nums[index])) {
            return index;
        }

        treeNode.val = Integer.parseInt(nums[index++]);
        if (index >= nums.length || "null".equals(nums[index])) {
            treeNode.left = null;
            index++;
        } else {
            treeNode.left = new TreeNode(Integer.parseInt(nums[index++]));
        }
        if (index >= nums.length || "null".equals(nums[index])) {
            treeNode.right = null;
            index++;
        } else {
            treeNode.right = new TreeNode(Integer.parseInt(nums[index++]));
        }

        index = constructTreeNode(nums, treeNode.left, index);
        index = constructTreeNode(nums, treeNode.right, index);

        return index;
    }
}
