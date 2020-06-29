package easy;

/**
 * @说明：
 * @类型名称：SubtractProductAndSum1281
 * @创建者: Raiden
 * @创建时间: 2020/6/29 17:20
 * @修改者: Raiden
 * @修改时间: 2020/6/29 17:20
 */
public class SubtractProductAndSum1281 {

    /**
     * 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
     * 输入：n = 234
     * 输出：15
     * 解释：
     * 各位数之积 = 2 * 3 * 4 = 24
     * 各位数之和 = 2 + 3 + 4 = 9
     * 结果 = 24 - 9 = 15

     *
     *
     * @return
     */
    public static void main(String[] args) {
        int i = subtractProductAndSum(705);
        System.out.println(i);
    }

    public static int subtractProductAndSum(int n) {
        int sum=0;
        int mul=1;
        while (n!=0){
            sum+=(n%10);
            mul*=(n%10);
            n=n/10;
        }
        return mul-sum;
    }
}
