
    public class linkedList {
        class Node{
//            public Node (int value){
//                this.value=value;
//            }
            int value;
            Node nextNode;
        }
        Node first;
        Node last;
        int size =0;
        private  boolean isEmpty(){
            return first==null;
        }

        public void addFirst (int item){
            Node node = new Node(item);
            if (isEmpty()) {
                first = last = node;
            }
            else{
                node.nextNode=first;
                first=node;
            }

            size++;
        }
        public void addLast (int item){
            Node node =new Node(item);
            if (isEmpty()){
                first=last=node;
            }else {
                last.nextNode=node;
                last=node;

            }
            size++;
        }
        public void removeFirst (){
            if (isEmpty()){
                throw new NoSuchElementException;
            }
            if(first==last){
                first =last =null;
            }else{
                Node temp =first;
                first=first.nextNode;
                temp.nextNode=null;
            }
            size--;
        }
        private Node getBeforeLast() {
            Node beforeLast = first;
            Node current = first;
            while (current.nextNode != null) {
                beforeLast = current;
                current = current.nextNode;
            }
            return beforeLast;
        }
        public void removeLast(){
            if(isEmpty()){
                throw new NoSuchElementException;
            }
            if(first=last) {

                first=last=null;
            }
            else {
                Node beforeLast=new Node(getBeforeLast());
                last= beforeLast;
                last.nextNode=null;
            }


        }
    }

}
