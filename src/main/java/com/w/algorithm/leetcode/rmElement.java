package com.w.algorithm.leetcode;

/**
 * @ClassName rmElement
 * @Description [移除相同元素]
 * @Author ANGLE0
 * @Date 2020/5/5 16:50
 * @Version V1.0
 **/
public class rmElement {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int count = 0;
        int index = 0;

        while (index <= len-1-count){
            while (index < len && nums[index] != val){
                index++;
            }
            while (count < len && nums[len-1-count] == val){
                count++;
            }
            if (count == len)
                return 0;
            if (index < len-1-count){
                swap(nums, index, len-1-count);
            }
        }
        return len-count;
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
