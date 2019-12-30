package com.w.algorithm.base.insert;

/**
 * @ClassName InsertDirect
 * @Description [直接插入]
 * @Author ANGLE0
 * @Date 2019/12/30 19:28
 * @Version V1.0
 **/
public class InsertDirect {

    public static void main(String[] args) throws Exception {

        int[] data = new int[]{33, 12, 25, 46, 37, 68, 19, 80};

        int[] nums = InsertDirect(data);
        int i;

        for (i = 1; i < nums.length; i++) {
            System.out.print(" "+nums[i]);
        }

    }

    /**
     * DES：
     *     [直接插入排序]
     */
    private static int[] InsertDirect(int[] data) throws Exception {
        if (data == null)
            throw new Exception("待排序列为空");
        int[] nums  = new int[data.length+1];
        for (int i = 0; i < data.length; i++) {
            nums[i+1] = data[i];
        }

        int i, j;
        for (i = 2; i < nums.length; i++) {
            nums[0] = nums[i];//保存待查数据
            for (j = i-1; nums[0] < nums[j]; j--) {
                nums[j + 1] = nums[j];//记录后移
            }
                nums[j+1] = nums[0];//插入正确位置
        }
        return nums;
    }
}
