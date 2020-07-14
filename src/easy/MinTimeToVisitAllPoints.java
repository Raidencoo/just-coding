package easy;

/**
 * @说明：
 * @类型名称：MinTimeToVisitAllPoints
 * @创建者: Raiden
 * @创建时间: 2020/7/10 17:43
 * @修改者: Raiden
 * @修改时间: 2020/7/10 17:43
 */
public class MinTimeToVisitAllPoints {


    /**
     * 平面上有 n 个点，点的位置用整数坐标表示 points[i] = [xi, yi]。请你计算访问所有这些点需要的最小时间（以秒为单位）。
     *
     * 你可以按照下面的规则在平面上移动：
     * 每一秒沿水平或者竖直方向移动一个单位长度，或者跨过对角线（可以看作在一秒内向水平和竖直方向各移动一个单位长度）。
     * 必须按照数组中出现的顺序来访问这些点。
     */
    public static void main(String[] args) {
        int[][] ints = new int[3][2];
        ints[0][0]=1;
        ints[0][1]=1;
        ints[1][0]=3;
        ints[1][1]=4;
        ints[2][0]=-1;
        ints[2][1]=0;
        minTimeToVisitAllPoints(ints);
    }
    public static int minTimeToVisitAllPoints(int[][] points) {
        int time=0;
        for (int i=0;i<points.length-1;i++){
            int[] point1 = points[i];
            int[] point2 = points[i+1];
            int x1=point1[0];
            int y1=point1[1];
            int x2=point2[0];
            int y2=point2[1];
            int i1 = Math.abs(x2 - x1);
            int i2 = Math.abs(y2 - y1);
            int x = Math.abs(i1 - i2) + Math.min(i1, i2);
            time+=x;

        }
        return time;
    }
}
