package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution41;

public class MySolution41 implements Solution41 {
    @Override
    public int firstMissingPositive(int[] nums) {
        if(nums.length == 0)
            return 1;

        int missingPositive = 1;
        boolean missedInArray = false;
        for(int i = 0; i < nums.length; i++){
            while (i + 1 != nums[i]){
                if(nums[i] <= 0 || nums[i] > nums.length)
                    break;

                int rightIndex = nums[i] - 1;
                if(nums[i] == nums[rightIndex])
                    break;

                nums[i] ^= nums[rightIndex];
                nums[rightIndex] ^= nums[i];
                nums[i] ^= nums[rightIndex];
            }

        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                missedInArray = true;
                missingPositive = i + 1;
                break;
            }
        }

        if(!missedInArray)
            return nums.length + 1;
        return missingPositive;
    }
}
