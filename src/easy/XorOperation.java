package easy;

/**
 * @说明：
 * @类型名称：XorOperation
 * @创建者: Raiden
 * @创建时间: 2020/6/24 16:15
 * @修改者: Raiden
 * @修改时间: 2020/6/24 16:15
 */
public class XorOperation {
/**
 * 给你两个整数，n 和 start 。
 *
 * 数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。
 *
 * 请返回 nums 中所有元素按位异或（XOR）后得到的结果。
 *
 *
 */
    public static void main(String[] args) {
        System.out.println( (3/2)^(3/2+1)^(3-1));
        System.out.println(4^2);
        System.out.println(2^1);
        System.out.println(5&1);
        System.out.println(xorOperation(10,4));
    }
    public static int xorOperation(int n, int start) {
        if (n==0){
            return 0;
        }
        int result=start;
        for (int i=1;i<n;i++){
            result=result^(start+2*i);
        }

        return result;
    }
}
