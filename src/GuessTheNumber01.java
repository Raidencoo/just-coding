import java.util.HashMap;

/**
 * @说明：
 * @类型名称：GuessTheNumber
 * @创建者: Raiden
 * @创建时间: 2020/4/28 14:49
 * @修改者: Raiden
 * @修改时间: 2020/4/28 14:49
 */


/*
*
小A 和 小B 在玩猜数字。小B 每次从 1, 2, 3 中随机选择一个，小A 每次也从 1, 2, 3 中选择一个猜。他们一共进行三次这个游戏，请返回 小A 猜对了几次？
输入的guess数组为 小A 每次的猜测，answer数组为 小B 每次的选择。guess和answer的长度都等于3。
*
* */
public class GuessTheNumber01 {

    public static void main(String[] args) {
        int[] guess={1,2,3};
        int[] answer={2,2,3};
        int game = game(guess, answer);

        System.out.println(game);

    }

    public static int game(int[] guess, int[] answer) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count=0;
        for(int i=0;i<guess.length;i++){

            if (guess[i]==answer[i]){
                count++;
            }

        }
        return count;
    }

}
