import java.util.NoSuchElementException;

public class StackBasedOnArray {
    int [] items;
    int size;
    int count =0;

    public StackBasedOnArray(int size) {
        this.size = size;
        items=new int[size];
    }
    public StackBasedOnArray() {
        this.size = 100;
        items= new int[size];
    }
    public void push (int value) {
        if (count == size) {
          createArray();
        }
        items[count]=value;
        count++;
    }
    public boolean isEmpty() {
        return count==0;
    }
    private void  createArray(){
            size*=2;
            int[] newArray=new int[size];
            for(int i=0;i<count;i++) {
                newArray[i] = items[i];
            }
            items=newArray;

        }
        public int peak(){
        if (isEmpty()){
            throw new NoSuchElementException("stack is empty");
        }
        return items[count-1];
        }
     public int pop(){
        if (isEmpty()){
            throw new NoSuchElementException("stack is empty");
        }
        count--;
        return items[count];
     }
    }

