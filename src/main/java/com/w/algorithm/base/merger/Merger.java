package com.w.algorithm.base.merger;

import com.w.algorithm.base.common.Sort;

import java.lang.reflect.Array;

/**
 * @ClassName Merger
 * @Description [归并排序]
 * @Author ANGLE0
 * @Date 2020/5/2 21:55
 * @Version V1.0
 **/
public class Merger implements Sort {
    @Override
    public void sort(int[] nums) {
        this.marger(nums);
    }

    public void marger(int[] nums){
        int len = nums.length;
        int middle = len / 2;
        int[] resultNums = new int[nums.length];

        //左半边开始的位置
        int leftPos = 0;
        //右半边开始的位置
        int rightPos = middle+1;
        //最终数组的当前位置
        int resultPos = 0;

        while (leftPos < middle && rightPos < len){
            resultNums[resultPos] = nums[leftPos] < nums[rightPos] ? nums[leftPos] : nums[rightPos];
        }

        while (leftPos <= middle){
            resultNums[resultPos++] = nums[leftPos++];
        }

        while (rightPos <= len){
            resultNums[resultPos] = resultNums[rightPos];
        }
    }
}
