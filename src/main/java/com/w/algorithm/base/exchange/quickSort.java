package com.w.algorithm.base.exchange;

/**
 * @ClassName quickSort
 * @Description [快排]
 * @Author ANGLE0
 * @Date 2019/12/30 20:21
 * @Version V1.0
 **/
public class quickSort {

    public static void main(String[] args) {

        int[] data = new int[]{33, 12, 25, 46, 37, 68, 19, 80};
        int[] nums  = new int[data.length+1];
        for (int i = 0; i < data.length; i++) {
            nums[i+1] = data[i];
        }

        QKSort(nums, 0, nums.length - 1);

        for (int i = 1; i < nums.length; i++) {
            System.out.print(" "+nums[i]);
        }

    }

    /**
     * DES：
     *     [快排]
     */
    public static void QKSort(int[] nums, int low, int height){
        int pos = 0;
        if (low < height){
            pos = QKpass(nums, low, height);
            QKSort(nums, low, pos-1);
            QKSort(nums, pos+1, height);
        }
    }

    /**
     * DES：
     *     [一趟快排]
     */
    public static int  QKpass(int[] nums, int low, int hight){
        nums[0] = nums[low];
        while (low < hight){
            while (low < hight && nums[hight] >= nums[0])
                --hight;
            nums[low] = nums[hight];
            while (low < hight && nums[low] < nums[0])
                ++low;
            nums[hight] = nums[low];
        }
        nums[low] = nums[0];
        return low;
    }

}
