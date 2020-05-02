package com.w.algorithm.base;

import com.w.algorithm.base.choise.Selection;
import com.w.algorithm.base.common.Sort;
import com.w.algorithm.base.insert.InsertDirect;
import com.w.algorithm.base.insert.shellSort;
import com.w.algorithm.base.merger.Merger;
import com.w.algorithm.base.utils.SortUtils;

import java.util.Arrays;

/**
 * @ClassName Test
 * @Description [测试]
 * @Author ANGLE0
 * @Date 2020/5/1 20:43
 * @Version V1.0
 **/
public class Test {
    public static void main(String[] args) {

        Sort sort;
        int[] results;
        //无重复数据的数组
        int[] noSameNums = new int[]{6,3,2,4,5,8,6,23,22};
        //有重复数据的数组
        int[] sameNums = new int[]{2,3,4,1,45,6,7,5,3,3,2,1};

        //创建排序对象并执行方法
        sort = new Merger();
        sort.sort(noSameNums);
        //打印排序结果
        SortUtils.print(noSameNums);

        //准备两个相同的乱序数组
        int[] nums = SortUtils.generateRandomArray();
        int[] copyNums = new int[nums.length];
        System.arraycopy(nums, 0, copyNums, 0, nums.length);

        //分别用提供的工具和自己编写的工具排序
        Arrays.sort(nums);
        sort.sort(copyNums);

        //检查结果
        int checkResult = SortUtils.check(nums, copyNums);
        //打印排序结果
        System.out.println(checkResult == 1? "Right": ((checkResult == -1) ?  "length1 != length2" :"Wrong")  );

    }
}
