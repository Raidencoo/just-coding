package easy;

/**
 * @说明：
 * @类型名称：MinCount
 * @创建者: Raiden
 * @创建时间: 2020/7/10 17:21
 * @修改者: Raiden
 * @修改时间: 2020/7/10 17:21
 */
public class MinCount {
    /**
     * 桌上有 n 堆力扣币，每堆的数量保存在数组 coins 中。我们每次可以选择任意一堆，拿走其中的一枚或者两枚，求拿完所有力扣币的最少次数。
     * @param coins
     * @return
     */
    public int minCount(int[] coins) {

        int sum=0;
        for(int i=0;i<coins.length;i++){
            int v = (int)Math.ceil(coins[i] / 2.0);
            sum+=v;
        }
        return sum;

    }
}
