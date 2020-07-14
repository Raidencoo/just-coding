package easy;

/**
 * @说明：
 * @类型名称：RunningSum
 * @创建者: Raiden
 * @创建时间: 2020/7/6 13:47
 * @修改者: Raiden
 * @修改时间: 2020/7/6 13:47
 */
public class RunningSum1480 {

    public int[] runningSum(int[] nums) {
        int sum=0;

        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            nums[i]=sum;
        }
        return nums;
    }
}
