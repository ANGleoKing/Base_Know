package com.w.algorithm.base.exchange;

import com.w.algorithm.base.common.Sort;
import com.w.algorithm.base.utils.SortUtils;

/**
 * @ClassName quickSort
 * @Description [快排]
 * @Author ANGLE0
 * @Date 2019/12/30 20:21
 * @Version V1.0
 **/
public class QuickSort implements Sort{
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
     * DES：[快排]
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
     * DES：[一趟快排]
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

    /**
     * 快排策略：
     *  找一个标准，将数组排序为两部分，一部分小于等于这个标准，一部分大于这个标准
     *  而后依次在两个分区，同时执行上述算法
     *  */
    @Override
    public void sort(int[] nums) {
        qSort(nums, 0, nums.length-1);
    }

    /**
     * 递归调用
     * */
    public static void qSort(int[] nums, int leftBound, int rightBound){
        if (leftBound >= rightBound)return;
        int mid = partition(nums, leftBound, rightBound);
        qSort(nums, leftBound, mid-1);
        qSort(nums, mid+1, rightBound);
    }

    /**
     * 单次快排
     * 将范围内数据使用快排策略完成排序，同时返回中间值
     * */
    public static int partition(int[] nums, int leftBound, int rightBound){
        //设定比较标准
        int pivot = nums[rightBound];
        //设置左边界
        int leftPos = leftBound;
        //设置右边界
        int rightPos = rightBound-1;
        //左指针向右移动---><---右指针向左移动,故当左指针大于等于右指针,则排序完成
        while (leftPos <= rightPos){
            //找到左边第一个比标准大的值
            while (leftPos <= rightPos && nums[leftPos] <= pivot){
                leftPos++;}
            //找到右边第一个比标准小的值
            while (leftPos <= rightPos && nums[rightPos] > pivot){
                rightPos--;}
            //leftPos < rightPos,则找到了左边>标准，右边<标准的值
            if (leftPos < rightPos){
                SortUtils.swap(nums, leftPos, rightPos);
            }
        }
        //上面交换完后leftPos的位置就是靠近中间的位置（而此处的值是大于基础值的），此时需要将标准和左指针指向的值交换，同时返回leftPos的值作为中间值
        SortUtils.swap(nums, leftPos, rightBound);
        return leftPos;
    }
}
