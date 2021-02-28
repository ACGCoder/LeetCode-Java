package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution27;

public class MySolution27 implements Solution27 {
    @Override
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int i = 0, j = nums.length - 1;
        while (i < j) {
            if (nums[i] != val)
                i++;
            else if (nums[j] == val)
                j--;
            else {
                int k = nums[j];
                nums[j--] = nums[i];
                nums[i++] = k;
            }
        }

        return nums[j] == val ? j : j + 1;
    }
}
