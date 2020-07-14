package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @说明：
 * @类型名称：Intersect
 * @创建者: Raiden
 * @创建时间: 2020/7/13 9:45
 * @修改者: Raiden
 * @修改时间: 2020/7/13 9:45
 */
public class Intersect {

    /**
     * 给定两个数组，编写一个函数来计算它们的交集。
     * @return
     *
     *
     */
    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        int[] ints = intersect(nums1, nums2);

    }
    public static int[] intersect(int[] nums1, int[] nums2) {

            int i1 = nums1.length;
            int i2 = nums2.length;
            if (i1>i2){
                return intersect(nums2,nums1);
            }
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i=0;i<i1;i++){
                if (map.containsKey(nums1[i])){
                    map.put(nums1[i],map.get(nums1[i])+1);
                }else {
                    map.put(nums1[i],1);
                }

            }
            int[] ints = new int[i1];

            int j=0;
            for (int i=0;i<i2;i++){
                if (map.containsKey(nums2[i])){
                    Integer count = map.get(nums2[i])-1;

                    if (count>=0){
                        ints[j]=nums2[i];
                        map.put(nums2[i],count);
                        j++;
                    }
                }
            }

            return Arrays.copyOfRange(ints,0,j);

    }
}
