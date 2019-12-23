package algorithm.leetcode.Q1_50;

import java.util.Scanner;

/**
 * @ClassName licode1
 * @Description
 * @Author ANGLE0
 * @Date2019/12/20 14:24
 * @Version V1.0
 **/
public class licode1_10 {


    /*
        DES：
            AB链表求和
     */
    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);

        ListNode p = l1, q = l2, list = res;
        int upNum = 0;
        while (p != null || q != null) {
            int x = p != null ? p.val : 0;
            int y = q != null ? q.val : 0;

            int sum = x + y + upNum;
            upNum = sum / 10;
            list.next = new ListNode(sum % 10);
            list = list.next;

            if (p != null)
                p = p.next;
            if (q != null)
                q = q.next;
        }
        if (upNum > 0)
            list.next = new ListNode(upNum);
        return res.next;
    }

    /*
        DES：
            求解AB，Sorted数组中位数
     */
    public double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;

        if (m > n) { // to ensure m<=n
            int[] temp = A; A = B; B = temp;
            int tmp = m; m = n; n = tmp;
        }

        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            if (i < iMax && B[j-1] > A[i]){
                iMin = i + 1; // i is too small
            }
            else if (i > iMin && A[i-1] > B[j]) {
                iMax = i - 1; // i is too big
            }
            else { // i is perfect
                int maxLeft = 0;
                if (i == 0) { maxLeft = B[j-1]; }
                else if (j == 0) { maxLeft = A[i-1]; }
                else { maxLeft = Math.max(A[i-1], B[j-1]); }
                if ( (m + n) % 2 == 1 ) { return maxLeft; }

                int minRight = 0;
                if (i == m) { minRight = B[j]; }
                else if (j == n) { minRight = A[i]; }
                else { minRight = Math.min(B[j], A[i]); }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }
    /*
     * DES：
     *     [测试HashTable算法中的与运算]
     *
     */
    private static void HashTest() {
        Scanner in = new Scanner(System.in);

        int number = 0;
        while(-1 != number){
            number = in.nextInt();
            int result = number & 0x7FFFFFFF;
            System.out.println("input number & 0x7FFFFFFF ="+ result);
        }
    }
    

}
