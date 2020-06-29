package easy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @说明：
 * @类型名称：CreateTargetArray1389
 * @创建者: Raiden
 * @创建时间: 2020/6/29 15:42
 * @修改者: Raiden
 * @修改时间: 2020/6/29 15:42
 */
public class CreateTargetArray1389 {
    /**
     * 给你两个整数数组 nums 和 index。你需要按照以下规则创建目标数组：
     *
     * 目标数组 target 最初为空。
     * 按从左到右的顺序依次读取 nums[i] 和 index[i]，在 target 数组中的下标 index[i] 处插入值 nums[i] 。
     * 重复上一步，直到在 nums 和 index 中都没有要读取的元素。
     * 请你返回目标数组。
     *
     * 题目保证数字插入位置总是存在。
     * 输入：nums = [0,1,2,3,4], index = [0,1,2,2,1]
     * 输出：[0,4,1,3,2]
     * 解释：
     * nums       index     target
     * 0            0        [0]
     * 1            1        [0,1]
     * 2            2        [0,1,2]
     * 3            2        [0,1,3,2]
     * 4            1        [0,4,1,3,2]
     */
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> integers = new ArrayList<>();
        for(int i=0;i<index.length;i++){
            integers.add(index[i],nums[i]);
        }
        int[] result = new int[nums.length];
        for (int i=0;i<integers.size();i++){
            result[i]=integers.get(i);
        }
        return result;

    }

}
