package easy;

import java.util.ArrayList;

/**
 * @说明：
 * @类型名称：DecompressRLElist
 * @创建者: Raiden
 * @创建时间: 2020/7/6 14:07
 * @修改者: Raiden
 * @修改时间: 2020/7/6 14:07
 */
public class DecompressRLElist {

    /**
     * 给你一个以行程长度编码压缩的整数列表 nums 
     * 考虑每对相邻的两个元素 [freq, val] = [nums[2*i], nums[2*i+1]] （其中 i >= 0 ），每一对都表示解压后子列表中有 freq 个值为
     * val 的元素，你需要从左到右连接所有子列表以生成解压后的列表
     * 请你返回解压后的列表。
     */
    public int[] decompressRLElist(int[] nums) {

        int length=0;
        for (int i=0;i<nums.length;i+=2){
            length+=nums[i];
        }
        int[] result = new int[length];
        int index=0;
        for (int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++){
                result[index]=nums[i+1];
                index++;
            }
        }
        return result;

    }
}
