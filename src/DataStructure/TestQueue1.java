package DataStructure;

/**
 * @说明：
 * @类型名称：TestQueue1
 * @创建者: Raiden
 * @创建时间: 2020/4/30 17:21
 * @修改者: Raiden
 * @修改时间: 2020/4/30 17:21
 */
public class TestQueue1 {


    public static void main(String[] args) {
        CircularQueue myQueue = new CircularQueue(10);
        myQueue.enQueue(6);

        myQueue.deQueue();
        myQueue.Front();
        myQueue.enQueue(10);
        myQueue.deQueue();
        myQueue.enQueue(12);
        for (int i=0;i<10;i++){
            myQueue.deQueue();

        }

        System.out.println(myQueue.Front());
        System.out.println(myQueue.Rear());



    }
}
