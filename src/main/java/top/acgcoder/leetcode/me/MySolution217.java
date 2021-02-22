package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution217;

import java.util.HashSet;

public class MySolution217 implements Solution217 {
    @Override
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>(nums.length);
        for (int num : nums){
            if (set.contains(num))
                return true;
            else
                set.add(num);
        }
        return false;
    }
}
