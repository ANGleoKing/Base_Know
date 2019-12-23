package algorithm.leetcode.Q1_50;

import com.sun.javafx.collections.MappingChange;
import org.junit.Test;

import java.util.*;

/**
 * @ClassName SumOfNumber
 * @Description
 * @Author ANGLE0
 * @Date 2019/12/23 20:31
 * @Version V1.0
 **/
public class SumOfNumber {
    /*
        DEC：
            求解A+B为定值的数据下标
     */
    public int[] twoSum(int[] nums, int target) throws IllegalAccessException {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalAccessException("No solution");
    }

    /*
     * DES：
     *      [三数之和为0]
     *      A+B+C = 0,返回不重复的三元组
     *
     *
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        int len = nums.length;
        if(nums == null || len < 3) return result;
        Arrays.sort(nums);
        for (int i = 0; i < len ; i++) {
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int L = i+1;
            int R = len-1;
            while(L < R){
                int sum = nums[i] + nums[L] + nums[R];
                if(sum == 0){
                    ArrayList a = new ArrayList();
                    a.add(nums[i]);
                    a.add(nums[L]);
                    a.add(nums[R]);
                    result.add(a);
                    while (L<R  && nums[L] == nums[L+1]) L++;
                    while (L<R  && nums[R] == nums[R-1]) R--;
                    L++;
                    R--;
                }
                else if (sum < 0) L++;
                else if (sum > 0) R--;
            }
        }
        return result;
    }
    /*
     * DES：
     *     [给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。]
     *
     */
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for(int i=0;i<nums.length;i++) {
            int start = i+1, end = nums.length - 1;
            while(start < end) {
                int sum = nums[start] + nums[end] + nums[i];
                if(Math.abs(target - sum) < Math.abs(target - ans))
                    ans = sum;
                if(sum > target)
                    end--;
                else if(sum < target)
                    start++;
                else
                    return ans;
            }
        }
        return ans;
    }
}
