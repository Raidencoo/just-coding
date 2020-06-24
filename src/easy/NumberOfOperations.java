package easy;

/**
 * @说明：
 * @类型名称：NumberOfOperations
 * @创建者: Raiden
 * @创建时间: 2020/4/28 16:50
 * @修改者: Raiden
 * @修改时间: 2020/4/28 16:50
 */
/*
*
*
* */
/*
* 给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
* */
public class NumberOfOperations {

    public static void main(String[] args) {

        int number = numberOfSteps(14);
        System.out.println(number);
    }

    public static int numberOfSteps (int num) {
        if (num==0){
            return 0;
        }

        if ((num%2)==0){
            num=num/2;
        }
        else if ((num%2)==1){
            num--;
        }

        return numberOfSteps(num)+1;
    }



}
