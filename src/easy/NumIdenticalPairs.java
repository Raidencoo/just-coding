package easy;

import java.util.*;

/**
 * @说明：
 * @类型名称：NumIdenticalPairs
 * @创建者: Raiden
 * @创建时间: 2020/7/13 11:21
 * @修改者: Raiden
 * @修改时间: 2020/7/13 11:21
 */
public class NumIdenticalPairs {
    /**
     * 给你一个整数数组 nums 。
     *
     * 如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对
     * 返回好数对的数目。
     */
    public static void main(String[] args) {
        int[] x={1,2,3,1,1,3};
        numIdenticalPairs(x);
    }
    public static int numIdenticalPairs(int[] nums) {


        int[] counter = new int[101];
        int total = 0;
        for(int d : nums) {
            ++counter[d];
            total += counter[d] - 1;
        }
        return total;

    }
}
