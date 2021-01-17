package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution448;

import java.util.ArrayList;
import java.util.List;

public class MySolution448 implements Solution448 {
    @Override
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            while (i + 1 != nums[i]){
                int rightIndex = nums[i] - 1;
                if(nums[i] == nums[rightIndex])
                    break;

                nums[i] ^= nums[rightIndex];
                nums[rightIndex] ^= nums[i];
                nums[i] ^= nums[rightIndex];
            }

        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i + 1)
                list.add(i + 1);
        }

        return list;
    }
}
