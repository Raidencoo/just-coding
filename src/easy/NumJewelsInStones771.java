package easy;

/**
 * @说明：
 * @类型名称：NumJewelsInStones771
 * @创建者: Raiden
 * @创建时间: 2020/6/29 15:16
 * @修改者: Raiden
 * @修改时间: 2020/6/29 15:16
 */
public class NumJewelsInStones771 {

    /**
     *  给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
     * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
     *
     * 输入: J = "aA", S = "aAAbbbb"
     * 输出: 3
     */
    public int numJewelsInStones(String J, String S) {
        int result=0;


        for (int i=0;i<S.length();i++){

            if (J.indexOf(String.valueOf(S.charAt(i)))>-1){
                result++;
            }

        }
        return result;
    }

}
