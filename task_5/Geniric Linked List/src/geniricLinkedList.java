import java.util.NoSuchElementException;
    public class geniricLinkedList<E> {
        private class Node {
            E value;

            public Node(E v) {
                value = v;
            }

            Node nextNode;
        }

      
        private Node first;
        private Node last;
        private int size = 0;


        private boolean isEmpty() { //O(1)
            return first == null;
        }

        public void addFirst(E item) { //O(1)
            Node node = new Node(item);
            if (isEmpty()) {
                first = last = node;
            } else {
                node.nextNode = first;
                first = node;
            }

            size++;
        }

        public void addLast(E item) {    //o(1)
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

        public int indexOf(E item) {   //O(n)
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

        public boolean contains(E item) {   //O(n)
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

        public void reverse() {
            if (isEmpty()) {
                return;
            }
            Node previous = first;
            Node current = first.nextNode;
             while (current != null) {
                Node next = current.nextNode;
                current.nextNode=previous;
                previous=current;
                current =next ;
            }
           Node temp =first;
             first=last;
             last =temp;
             last.nextNode=null;



        }
    }