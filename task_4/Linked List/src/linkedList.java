import java.util.NoSuchElementException;

public class linkedList {
    private class Node {
        public Node(int v) {
            value = v;
        }

        int value;
        Node nextNode;
    }

    linkedList list;
    private Node first;
    private Node last;
    private int size = 0;


    private boolean isEmpty() { //O(1)
        return first == null;
    }

    public void addFirst(int item) { //O(1)
        Node node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.nextNode = first;
            first = node;
        }

        size++;
    }

    public void addLast(int item) {    //o(1)
        Node node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            last.nextNode = node;
            last = node;

        }
        size++;
    }

    public void removeFirst() {      //o(1)
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
        } else {
            Node temp = first;
            first = first.nextNode;
            temp.nextNode = null;
        }
        size--;
    }

    private Node getBeforeLast() {  //O(n)
        Node beforeLast = first;
        Node current = first;
        while (current.nextNode != null) {
            beforeLast = current;
            current = current.nextNode;
        }
        return beforeLast;
    }

    public void removeLast() {     //O(n)
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {

            first = last = null;
        } else {
            Node beforeLast = getBeforeLast();
            last = beforeLast;
            last.nextNode = null;
        }
        size--;

    }

    public int indexOf(int item) {   //O(n)
        Node current = first;
        int index = 0;
        while (current != null) {
            if (current.value == item)
                return index;

            index++;
            current = current.nextNode;
        }
        return -1;
    }

    public boolean contains(int item) {   //O(n)
        int index = indexOf(item);
        return index != -1;
    }

    public int size() {
        return size;
    }

    public void printElements() {    //O(n)
        Node current = first;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.nextNode;
        }
        System.out.println();
    }

    public int max() {   //O(n)
        Node max = first;
        Node current = first;
        while (current != null) {
            if (current.value > max.value) {
                max.value = current.value;
            }
            current = current.nextNode;


        }
        return max.value;
    }

    public int min() {    //O(n
        Node min = first;
        Node current = first;
        while (current != null) {
            if (current.value < min.value) {
                min.value = current.value;
            }
            current = current.nextNode;


        }
        return min.value;
    }
}




