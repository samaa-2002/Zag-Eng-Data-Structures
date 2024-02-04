import java.util.LinkedList;
import java.util.NoSuchElementException;

public class QueueLinkedListBased {
    LinkedList<Integer> list=new LinkedList<>();

    public void enqueue(int item){
        list.addLast(item);
    }
    public int dequeue (){
        if(list.isEmpty()){
            throw new NoSuchElementException("queue is empty");
        }
        return list.removeFirst();

    }
    public int peak(){
        if(list.isEmpty()){
            throw new NoSuchElementException("queue is empty");
        }
        return list.getFirst();
    }
    public void printQueue(){
        System.out.println(list.toString());
    }
}
