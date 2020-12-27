package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution645;

import java.util.HashSet;
import java.util.Set;

public class MySolution645 implements Solution645 {
 /*   public int[] findErrorNums(int[] nums) {
        int sum = 0;
        int duplicatedValue = 0;
        Set<Integer> set = new HashSet<>(nums.length);
        for(int num : nums){
            sum += num;
            if(set.contains(num))
                duplicatedValue = num;
            else
                set.add(num);
        }
        int expectedSum = nums.length * (1 + nums.length) / 2;
        return new int[]{duplicatedValue, expectedSum - (sum - duplicatedValue)};
    }*/

    @Override
    public int[] findErrorNums(int[] nums) {
        int misssingValue = 0;
        int duplicatedValue = 0;
        for(int i = 0; i < nums.length; i++){
            while(nums[i] - 1 != i){
                if(nums[nums[i] - 1] == nums[i]){
                    duplicatedValue = nums[i];
                    misssingValue = i + 1;
                    break;
                }
                int correctIndex = nums[i] - 1;
                nums[correctIndex] ^= nums[i];
                nums[i] ^= nums[correctIndex];
                nums[correctIndex] ^= nums[i];
            }
        }
        return new int[]{duplicatedValue, misssingValue};
    }
}
