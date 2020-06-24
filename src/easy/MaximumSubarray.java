package easy;

/**
 * @说明：
 * @类型名称：MaximumSubarray
 * @创建者: Raiden
 * @创建时间: 2020/6/5 17:09
 * @修改者: Raiden
 * @修改时间: 2020/6/5 17:09
 */

import java.util.HashSet;

/**
  给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
  示例:
  输入: [-2,1,-3,4,-1,2,1,-5,4],
  输出: 6
  解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。

 */
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int maxSubArray = maxSubArray(nums);
        new HashSet<>();
        System.out.println(maxSubArray);
    }

    public static int maxSubArray(int[] nums) {
        if (nums==null){
            return 0;
        }
        int maxSum=nums[0];
        int sum=nums[0];
        for (int i=1;i<nums.length;i++){
            if (sum>0){
                sum+=nums[i];
            }else {
                sum=nums[i];
            }
            maxSum=Math.max(sum,maxSum);
        }

        return maxSum;
    }


}
