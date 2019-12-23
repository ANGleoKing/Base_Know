package algorithm.leetcode.Q1_50;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @ClassNameString
 * @Description
 * @Author ANGLE0
 * @Date 2019/12/23 23:24
 * @Version V1.0
 **/
public class IString {
    /*
     * DES：
     *     [给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。]
     *
     */
    public int lengthOfLongestSubstring(java.lang.String s) {
        //滑动窗口
        if (null == s || s.equals("")) return 0;
        Set<Character> set = new HashSet();
        int max = 0, len = 0;
        int i = 0, j = 0, length = s.length();
        while(i < length && j < length){
            //set中不包含此字符则放入set
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                len = j - i;
            }else {
                //包含此字符则移除首个字符
                set.remove(s.charAt(i++));
            }
            max = Math.max(len, max);
        }
        return max;
    }
    /* 滑动窗口优化,licode官方解 */
    public int alengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
    /* 假定字符集，licode官方解 */
    public int blengthOfLongestSubstring(String s) {
        //假定字符集
        int n = s.length(), ans = 0;
        int[] index = new int[128];
        for (int j = 0, i = 0; j < n; j++) {
            i = index[s.charAt(j)] > i ? index[s.charAt(j)] : i ;
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
}
