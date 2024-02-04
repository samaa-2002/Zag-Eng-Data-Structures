import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Stack;

public class QueueArrayBased {

        int[] items;
        int size=0;
        int count=0;
        int first;
        int last;

        public QueueArrayBased(int size) {
            this.size = size;
            items=new int[size];
        }
        public boolean isEmpty(){
            return count==0;
        }
       public boolean isFull(){
            return count==size;
        }
        public void enqueue (int element){
            if (isFull()) {
                throw new ArrayIndexOutOfBoundsException ("it is full");
            }
           items[last]=element;
            last=(last+1)%size;
            count++;
        }

        public int dequeue(){
            if(isEmpty()){
                throw new NoSuchElementException("it is empty");
            }
            int temp=items[first];
            items[first]=0;
            first=(first+1)%size;
            count--;
            return temp;
        }
        public int peak(){
            return items[first];
        }

    public void printQueue() {
        System.out.print("[");
        if (!isEmpty()) {
            System.out.print(items[first]);
            int current = (first + 1) % size;
            while (current != last) {
                System.out.print("," + items[current]);
                current=(current+1)%size;
            }
            System.out.println("]");
            }
      }

    }


