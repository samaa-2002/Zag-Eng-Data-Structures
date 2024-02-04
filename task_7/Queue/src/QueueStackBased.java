import java.util.NoSuchElementException;
import java.util.Stack;

public class QueueStackBased {
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();
    public void enqueue (int item){
        stack1.push(item);
    }
    public int dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException("queue is empty");
        }
        if (stack2.isEmpty())
            moveStack1ToStack2();

        return stack2.pop();
    }
    public int peek(){
        if(isEmpty()){
            throw new NoSuchElementException("queue is empty");
        }
        if (stack2.isEmpty())
            moveStack1ToStack2();

        return stack2.peek();
    }

    public boolean isEmpty(){
        return stack2.isEmpty()&&stack1.isEmpty();
    }
    public void moveStack1ToStack2 (){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
    public void printQueue (){
        if(isEmpty()){
            throw new NoSuchElementException("queue is empty");
        }
        if (stack2.isEmpty())
            moveStack1ToStack2();
        System.out.print("[");
        while (!stack2.isEmpty())
            System.out.print(" "+stack2.pop()+" ");

        System.out.println("]");
    }
}

