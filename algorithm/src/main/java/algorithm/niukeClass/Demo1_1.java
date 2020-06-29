package algorithm.niukeClass;

/**
 * @ClassName Demo1_1
 * @Description [数组覆盖，定长绳子覆盖数组中的尽可能多的点]
 * @Author ANGLE0
 * @Date 2020/6/29 22:44
 * @Version V1.0
 **/
public class Demo1_1 {

    /**
     * Title： [暴力]
     *
     * DESC: [ 以每一个点为起始向后遍历]
     *      {
     *          当当前点和遍历的点相差超过绳子长度则此时范围内的就是覆盖的点
     *      }
     *
     * Time: O( N^2 )
     * Space: O(  )
     *
     */

    /**
     * Title： [二分法]
     *
     * DESC: [ 以每一个点为结束，通过 长度-当前点位置确定最早开始的位置 ]
     *      {
     *          例如：长度为 9 , 当前为第一个结点 数值为2
     *          能覆盖的开始位置是： 2 - 9 = -7
     *      }
     *
     * Time: O( N * logN )
     * Space: O(  )
     *
     */

    /**
     * Title： [ 双指针 ]
     *
     * DESC: [ L指向起始位置， R指向结束位置 ]
     *      {
     *          先后移动R 和  L,实现对数组的遍历
     *      }
     *
     * Time: O( 2 * N ) = O( N )
     * Space: O(  )
     *
     */
}
