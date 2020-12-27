package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution697;

import java.util.Arrays;

public class MySolution697 implements Solution697 {
    // Timeout
    @Override
    public int findShortestSubArray(int[] nums) {
        if(nums.length == 1)
            return 1;

        if(nums.length == 2)
            if(nums[0] == nums[1])
                return 2;
            else
                return 1;

        int degree = calculateDegreeOfArray(nums);
        int shortestSubArrayLen = nums.length;
        for(int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int[] subArray = Arrays.stream(nums).skip(i).limit(j - i + 1).toArray();
                if(calculateDegreeOfArray(subArray) == degree && subArray.length < shortestSubArrayLen)
                    shortestSubArrayLen = subArray.length;
            }
        }
        return shortestSubArrayLen;
    }

    private int calculateDegreeOfArray(int[] array){
        int degree = 1;
        for(int i = 0; i < array.length - 1; i++){
            int currentDegree = 1;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] == array[i])
                    currentDegree++;
            }
            if(currentDegree > degree)
                degree = currentDegree;
        }
        return degree;
    }
}
