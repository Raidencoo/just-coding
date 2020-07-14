package easy;

import java.util.Arrays;

/**
 * @说明：
 * @类型名称：SmallerNumbersThanCurrent
 * @创建者: Raiden
 * @创建时间: 2020/7/6 16:10
 * @修改者: Raiden
 * @修改时间: 2020/7/6 16:10
 */
public class SmallerNumbersThanCurrent1365 {

    /**
     * 给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目
     * 换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 
     * 以数组形式返回答案。
     */

    public static void main(String[] args) {
        int[] x={5,0,10,0,10,6};
        smallerNumbersThanCurrent(x);
    }
    public  static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freqs = new int[101];
        for (int num : nums) {
            freqs[num]++;
        }
        for (int i=1;i<freqs.length;i++){
            freqs[i]=freqs[i-1]+freqs[i];
        }
        int[] result = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            if (nums[i]>0) result[i]=freqs[nums[i]-1];
        }
        return result;
    }
}
