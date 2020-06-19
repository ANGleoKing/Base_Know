package algorithm.base.init.choise;

import algorithm.base.common.Sort;
import algorithm.base.common.utils.SortUtils;

/**
 * @ClassName Selection
 * @Description [选择排序]
 * @Author ANGLE0
 * @Date 2020/5/1 20:28
 * @Version V1.0
 **/
public class Selection implements Sort {
    public void sort(int[] nums){
        int minPos = -1;
        for (int i = 0; i < nums.length-1; i++) {
            minPos = i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[minPos] > nums[j])
                    minPos = j;
            }
            if (minPos != i){
                SortUtils.swap(nums, i, minPos);
            }
        }
    }
}
