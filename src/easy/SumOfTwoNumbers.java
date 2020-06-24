package easy;

import java.util.HashMap;

/**
 * @说明：
 * @类型名称：SumOfTwoNumbers
 * @创建者: Raiden
 * @创建时间: 2020/5/20 10:17
 * @修改者: Raiden
 * @修改时间: 2020/5/20 10:17
 */

/*  描述：
    给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，
    并返回他们的数组下标。你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
    示例:
    给定 nums = [2, 7, 11, 15], target = 9
    因为 nums[0] + nums[1] = 2 + 7 = 9
    所以返回 [0, 1]
*/

/*
    思路：
    首先想到便是直接双重嵌套循环，找出两数之和==target，但时间复杂度为O（N^2），应该避免这种操作，所以转换思路，
    以空间来换取时间。
    1.转换思路，求和转换成求差，用target减去当前遍历的数字，得到当前数字的正确对应答案，比如：
    当前循环数字为2，9-2=7，那么若nums存在7，则是正解。将此对应的另一个数放进map,key为值，value为当前数下标。
    2.当数组第一个数遍历时，将其下标与对应的另一个数放进map，当后续遍历时，当前遍历的值若在map中找到，
    说明该数在数组中存在一个数与其求和=target,得到其下标，并以此为key，得到对应的数在数组中的下标。
    3.不能重复利用同样的元素，所以判断map中是否存在对应的数和放进map的操作应该是一前一后，不然先放进map,
    若是target=2num[i],则会造成取了重复元素。

*/
public class SumOfTwoNumbers {

    public static void main(String[] args) {
        getSubscript(new int[]{3,2,4},5);
    }

    public  static int[] getSubscript(int[] nums,int target){
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){

            if (map.containsKey(nums[i])){
                result[0]=map.get(nums[i]);
                result[1]=i;
                return result;
            }
            map.put(target-nums[i],i);


        }
        return result;
    }


}
