package easy;

/**
 * @说明：
 * @类型名称：FindNumbers
 * @创建者: Raiden
 * @创建时间: 2020/7/6 15:33
 * @修改者: Raiden
 * @修改时间: 2020/7/6 15:33
 */
public class FindNumbers {

    /**
     * 给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。
     */


    public int findNumbers(int[] nums) {
        int result=0;
        for (int num:nums){
            int i = getCount(num) % 2 == 0 ? 1 : 0;
            result+=i;
        }
        return result;
    }

        public int getCount(int num){
            int count=0;
            while (num/10!=0){
                count++;
            }
            return count;
        }
}
