package com.w.algorithm.base.insert;

/**
 * @ClassName shellSort
 * @Description [希尔排序]
 * @Author ANGLE0
 * @Date 2019/12/30 19:54
 * @Version V1.0
 **/
public class shellSort {

    /**
     * DES：
     *     [排序函数]
     */
    private static void shellSort(int[] nums, int[] dlta, int t) {
        for (int k = 0; k < nums.length; t++) {
            shellInsert(nums, dlta[k]);
        }
    }

    /**
     * DES：
     *     [插入函数]
     */
    private static void shellInsert(int[] nums, int dk) {
        int i, j;
        for (i = dk+1; i < nums.length; i++) {
            if (nums[i] < nums[i-dk]) {
                nums[0] = nums[i];
                for (j = i-dk; j > 0 && nums[0] < nums[i]; j++) {
                    nums[j+dk] = nums[0];
                }
                nums[j+dk] = nums[0];
            }
        }
    }
}
