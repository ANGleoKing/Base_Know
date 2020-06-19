package algorithm.forOffer;

import org.junit.Test;

/**
 * @ClassName Main2
 * @Description [地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？]
 * @Author ANGLE0
 * @Date 2020/6/19 14:38
 * @Version V1.0
 **/
public class Main2 {

    // rows + cols < threshold,则为符合的格子
    public int movingCount(int threshold, int rows, int cols) {
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (getSingleNumber(i) + getSingleNumber(j) <= threshold){
                    count++;
                }
            }
        }
        return count;
    }

    public int getSingleNumber(int num){
        int temp = 0;
        while (num != 0){
            temp += num % 10;//获取个位
            num /= 10;
        }
        return temp;
    }

    @Test
    public void test(){
        System.out.println(movingCount(3, 2, 10));
    }
}
