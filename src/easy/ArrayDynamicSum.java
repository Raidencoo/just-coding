package easy;

/**
 * @说明：
 * @类型名称：ArrayDynamicSum
 * @创建者: Raiden
 * @创建时间: 2020/6/24 15:13
 * @修改者: Raiden
 * @修改时间: 2020/6/24 15:13
 */

/**
 * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 * 请返回 nums 的动态和。
 */
public class ArrayDynamicSum {

    public static void main(String[] args) {
        int[] x={1,2,3,4};
        int[] ints = runningSum(x);
        System.out.println(ints);
    }

    public static int[] runningSum(int[] nums) {
        if (nums==null){
            return null;
        }
        int sum=0;
        int[] sumArray=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            sumArray[i]=sum;
        }


        return sumArray;
    }
}
