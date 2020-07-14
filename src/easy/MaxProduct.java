package easy;

import java.util.Arrays;

/**
 * @说明：
 * @类型名称：MaxProduct
 * @创建者: Raiden
 * @创建时间: 2020/7/10 17:33
 * @修改者: Raiden
 * @修改时间: 2020/7/10 17:33
 */
public class MaxProduct {

    /**
     * 给你一个整数数组 nums，请你选择数组的两个不同下标 i 和 j，使 (nums[i]-1)*(nums[j]-1) 取得最大值。
     *
     * 请你计算并返回该式的最大值。

     */
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]);
    }

}
