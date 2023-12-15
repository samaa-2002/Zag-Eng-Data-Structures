import java.util.NoSuchElementException;

public class  StackBasedOnLinkedList<E> {
    private class Node {
        E value;
        Node button;

        public Node(E value) {
            this.value = value;
        }

    }
    Node top;
    public void push(E value) {
        Node node =new Node(value);
        node.button=top;
         top=node;
    }
    public boolean isEmpty(){
        return  (top==null);
    }
    public E peak(){
        if (isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }
        return top.value;
    }
    public E pop() {
        if (isEmpty())
            throw new IllegalStateException();
        E value = top.value;
        top = top.button;
        return value;
    }
}
