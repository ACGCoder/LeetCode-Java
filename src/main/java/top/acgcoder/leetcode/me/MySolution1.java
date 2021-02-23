package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution1;

import java.util.HashMap;

public class MySolution1 implements Solution1 {
    @Override
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.get(target - nums[i]) != null) {
                return new int[]{hashMap.get(target - nums[i]), i};
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
