public class PriorityQueue {
    int[] items;
    int size=0;
    int count=0;
    public PriorityQueue(int size) {
        this.size = size;
        items = new int[size];
    }
    private int getIndex(int element){
        int i=count-1;
        for(;i>=0;i--) {
            if (element < items[i])
                items[i + 1] = items[i];
            else
                break;
        }
             return i+1;

    }
    public void enqueue(int item){
        if(isFull()){
            throw new ArrayIndexOutOfBoundsException("queue is full");
        }
        int i=getIndex(item);
        items[i]=item;
        count++;
    }
    public int dequeue(){
      int  temp=items[0];
      for(int i=0;i<count-1;i++){
          items[i]=items[i+1];
      }
      count--;
      return temp;
    }
    public int peak(){
        return items[0];
    }
    public boolean isEmpty(){
        return count==0;
    }
    public boolean isFull(){
        return count==size;
    }
    public void printArray(){
        System.out.print("[");
        for(int i=0;i<count;i++){
            System.out.print(" "+items[i]+" ");
        }
        System.out.println("]");
    }
}
