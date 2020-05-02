package com.w.algorithm.base.utils;

import java.util.Random;

/**
 * @ClassName swap
 * @Description [交换]
 * @Author ANGLE0
 * @Date 2020/5/1 21:21
 * @Version V1.0
 **/
public class SortUtils {

    public static int arrayLength = 10000;
    public static int arrayMarge = 10000;

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void print(int[] nums){
        int len = nums.length-1;
        System.out.print("[");
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]+", ");
        }
        System.out.println(nums[len]+"]");
    }

    public static int[] generateRandomArray(){
        Random random = new Random();
        int[] nums = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            nums[i] = random.nextInt(arrayMarge);
        }
        return nums;
    }

    public static int check(int[] targetNums, int[] standardNums){
        if (targetNums.length != standardNums.length)
            return -1;
        for (int i = 0; i < targetNums.length; i++) {
            if (targetNums[i] != standardNums[i])
                return 0;
        }
        return 1;
    }
}
