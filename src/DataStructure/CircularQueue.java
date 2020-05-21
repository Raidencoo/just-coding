package DataStructure;

public class CircularQueue {

    /**
     * 初始容量
     */
    private static final int CAPACITY=100;
    /**
     * 队首位置
     */
    private int front=0;
    /**
     * 队尾位置
     */
    private int capacity;//数组的实际长度
    /**
     * 队尾位置
     */
    private int rear=0;
    private int[] queue;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public CircularQueue(int k) {
        capacity=k+1;
        queue=new int[capacity];
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (isFull()){
            return false;
        }

        queue[rear]=value;
        rear=(rear+1)%capacity;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty()){
            return false;
        }
        queue[front]=-1;
        front=(front+1)%capacity;

        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return queue[front];

    }

    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return queue[(rear-1+capacity)%capacity];

    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return (front==rear);
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        int size = (capacity - front + rear) % capacity;
        return size==capacity-1?true:false;


    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */