package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution628;

public class MySolution628 implements Solution628 {
    @Override
    public int maximumProduct(int[] nums) {
        if(nums.length == 3)
            return nums[0] * nums[1] * nums[2];

        int max = nums[0];
        int min = nums[0];
        int maxIndex = 0;
        int secondMaxIndex = 0;
        int thirdMaxIndex = 0;
        int minIndex = 0;
        int secondMinIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
            if(nums[i] < min){
                min = nums[i];
                minIndex = i;
            }
        }
        int secondMax = min;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= secondMax && i != maxIndex){
                secondMax = nums[i];
                secondMaxIndex = i;
            }
        }
        int thirdMax = min;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= thirdMax && i != maxIndex && i != secondMaxIndex){
                thirdMax = nums[i];
                thirdMaxIndex = i;
            }
        }
        int secondMin = max;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= secondMin && i != minIndex){
                secondMin = nums[i];
                secondMinIndex = i;
            }
        }
        if(nums[secondMinIndex] >= 0)
            return nums[maxIndex] * nums[secondMaxIndex] * nums[thirdMaxIndex];
        else{
            int firstValue = nums[maxIndex] * nums[secondMaxIndex] * nums[thirdMaxIndex];
            int secondValue = nums[maxIndex] * nums[minIndex] * nums[secondMinIndex];
            return Math.max(firstValue, secondValue);
        }
    }
}
