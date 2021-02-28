package top.acgcoder.leetcode.best;

import top.acgcoder.leetcode.Solution100;
import top.acgcoder.leetcode.common.TreeNode;

public class BestSolution100 implements Solution100 {
    /*  作者：LeetCode-Solution
        链接：https://leetcode-cn.com/problems/same-tree/solution/xiang-tong-de-shu-by-leetcode-solution/
        来源：力扣（LeetCode）
        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/
    @Override
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        } else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}
