import java.util.Stack;

public class Main {
    public static void main(String[] args) {
          // QueueArrayBased
        QueueArrayBased queue1 = new QueueArrayBased(5);
        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);
        queue1.enqueue(4);
        queue1.enqueue(5);
        queue1.printQueue();
        reverse(queue1);
        queue1.printQueue();
          // QueueStackBased
        QueueStackBased queue2=new QueueStackBased();
        queue2.enqueue(1);
        queue2.enqueue(2);
        queue2.enqueue(3);
        System.out.println(queue2.dequeue());
        queue2.printQueue();
          // PriorityQueue
        PriorityQueue queue3=new PriorityQueue(5);
        queue3.enqueue(7);
        queue3.enqueue(6);
        queue3.enqueue(2);
        queue3.enqueue(0);
        queue3.enqueue(5);
        queue3.printArray();
        System.out.println(queue3.dequeue());
        queue3.printArray();
          // QueueLinkedListBased
        QueueLinkedListBased queue4 = new QueueLinkedListBased();
        queue4.enqueue(1);
        queue4.enqueue(6);
        queue4.enqueue(5);
        System.out.println(queue4.dequeue());
        queue4.printQueue();
    }
    public static void reverse (QueueArrayBased queue){
        Stack<Integer> stack=new Stack<>();
        while (!queue.isEmpty()){
            stack.push(queue.dequeue());
        }
        while (!stack.isEmpty()){
            queue.enqueue(stack.pop());
        }
    }
}