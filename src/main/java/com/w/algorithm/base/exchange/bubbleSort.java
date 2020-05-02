package com.w.algorithm.base.exchange;

import com.w.algorithm.base.common.Sort;

/**
 * @ClassName bubbleSort
 * @Description [冒泡排序]
 * @Author ANGLE0
 * @Date 2019/12/30 20:13
 * @Version V1.0
 **/
public class bubbleSort implements Sort {

    public static void main(String[] args) {

        int[] nums = new int[]{33, 12, 25, 46, 37, 68, 19, 80};

        bubbleSort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(" "+nums[i]);
        }

    }

    /**
     * DES：
     *     [冒泡排序]
     */
    private static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]){
                    nums[i] = nums[j]+nums[i];
                    nums[j] = nums[i] - nums[j];
                    nums[i] = nums[i]-nums[j];
                }

            }
        }
    }

    /**
     * DES：
     *     [改进冒泡]
     */
    private static void bubbleSort2(int[] nums) {
        boolean flag = true;
        for (int i = 0; i < nums.length && false; i++) {
            flag = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]){
                    nums[i] = nums[j]+nums[i];
                    nums[j] = nums[i] - nums[j];
                    nums[i] = nums[i]-nums[j];
                    flag = true;
                }

            }
        }
    }

    @Override
    public void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]){
                    nums[i] = nums[j] + nums[i];
                    nums[j] = nums[i] - nums[j];
                    nums[i] = nums[i] - nums[j];
                }

            }
        }
    }
}
